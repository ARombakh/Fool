/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

import fool.Fool;
import static fool.Fool.CARDS_HAND;
import static fool.Fool.PLAYERS_QTY;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author artyom
 */
public class Controller {
    public Deck deck;
    public Player[] players;
    
    public Controller(Deck deck, Player[] players) {
        this.deck = deck;
        this.players = players;
    }
    
    public ArrayList<Beat> implementTurn(int playerIX) {        
        ArrayList<Beat> beats = new ArrayList<>();
        
        int card = 0;
        int nextPlayerIX = Fool.nextPlayer(playerIX);
        
        while (true) {
            System.out.println("Player " + playerIX + " cards:");
            System.out.println(players[playerIX].toString());
            card = goWithCard(playerIX);

            if (card == 0) {
                return beats;
            }

            Beat beat = new Beat(card);
            
            System.out.println("Player " + nextPlayerIX + " cards:");
            System.out.println(players[nextPlayerIX].toString());

            card = goWithCard(nextPlayerIX, card);

            if (card == 0) {
                for (Beat beat1 : beats) {
                    players[nextPlayerIX].takeCard(beat1.attack);
                    if (beat1.defend != 0) {
                        players[nextPlayerIX].takeCard(beat1.defend);
                    }
                }
                return beats;
            }

            beat.defend = card;

            beats.add(beat);
            
            for (Beat beat1 : beats) {
                System.out.printf("%s\n", beat1.toString());
            }
        }
    }

    public int goWithCard(int playerIX) {
        boolean extractSuccess = false;
        int cardToGo = 0;
        Scanner sc = new Scanner(System.in);
        while (!extractSuccess) {            
            System.out.printf("Extract card, player %d:\n", playerIX);
            cardToGo = sc.nextInt();
            if (cardToGo == 0) {
                return 0;
            }
            extractSuccess = players[playerIX].cards.extractCard(cardToGo);
            if(!extractSuccess) {
                System.out.println("No such card.");
            }
        }
        
        return cardToGo;
    }
    
    public int goWithCard(int playerIX, int attackCard) {
        boolean fitCard = false;
        int cardToGo = 0;

        while (!fitCard) {            
            System.out.println("Choose card to defend:");
            cardToGo = goWithCard(playerIX);
            if (cardToGo == 0) {
                return 0;
            }
            if (cardToGo < attackCard) {
                fitCard = false;
                System.out.println("You cannot beat with this card!");
            } else {
                fitCard = true;
            }
        }

        return cardToGo;
    }
}
