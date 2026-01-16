/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

import static fool.Fool.CARDS_HAND;
import static fool.Fool.PLAYERS_QTY;
import java.util.Random;

/**
 *
 * @author artyom
 */
public class Controller {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player[] players = new Player[PLAYERS_QTY];
        
        for (int i = 0; i < PLAYERS_QTY; i++) {
            players[i] = new Player();
        }

        for (Integer card : deck.cards.cards) {
            System.out.println(card);
        }
        
        System.out.println("");
        
        Random rand = new Random();
        
        int randCard;

        for (int i = 0; i < CARDS_HAND; i++) {
            randCard = rand.nextInt(0, deck.getSize());
            System.out.println(deck.cards.cards.get(randCard));
            players[0].takeCard(deck.cards.cards.remove(randCard));
        }

        System.out.println("");
        
        for (Integer card : deck.cards.cards) {
            System.out.println(card);
        }
        
        System.out.println("");

        for (Integer card : players[0].cards.cards) {
            System.out.println(card);
        }
    }
}
