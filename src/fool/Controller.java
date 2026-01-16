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
    
    public void implementTurn(int playerIX) {        
        ArrayList<Beat> beats = new ArrayList<>();
        
        int card = 0;
        
        card = goWithCard(playerIX);
        
        Beat beat = new Beat(card);
        
        int nextPlayerIX = Fool.nextPlayer(playerIX);
        
        card = goWithCard(nextPlayerIX, card);
        
        beat.defend = card;
        
        beats.add(beat);
    }

    public int goWithCard(int playerIX) {
        boolean extractSuccess = false;
        int cardToGo = 0;
        Scanner sc = new Scanner(System.in);
        while (!extractSuccess) {            
            System.out.printf("Extract card, player %d:\n", playerIX);
            cardToGo = sc.nextInt();
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
