/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author artyom
 */
public class Fool {
    public static final int PLAYERS_QTY = 2;
    public static final int CARDS_HAND = 6;
    
    public static int nextPlayer(int currPlIX) {
        if (currPlIX == PLAYERS_QTY - 1) {
            return 0;
        } else {
            return currPlIX + 1;
        }
    }
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player[] players = new Player[PLAYERS_QTY];
        
        for (int i = 0; i < PLAYERS_QTY; i++) {
            players[i] = new Player();
        }

        System.out.println(deck.toString());
        
        System.out.println("");
        
        Random rand = new Random();
        
        int randCard;
        int j;

        for (int i = 0; i < CARDS_HAND; i++) {
            for (j = 0; j < PLAYERS_QTY; j++) {
                randCard = rand.nextInt(0, deck.getSize());
                players[j].takeCard(deck.cards.cards.remove(randCard));
            }
        }
        
        System.out.println("");
        
        System.out.println(players[0].toString());
        
        System.out.println("");
        
        System.out.println(players[1].toString());

        System.out.println("");
        
        System.out.println(deck.toString());
        
        System.out.println("");
        
        Controller controller = new Controller(deck, players);
        
        ArrayList<Beat> beats = controller.implementTurn(0);
        
        for (Beat beat : beats) {
            System.out.print(beat.toString());
        }
    }
}