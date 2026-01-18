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
public class Deck {
    public CardList cards;
    public final static int CARDS_QTY = 36;
    
    public Deck() {
        this.cards = new CardList();
        for (int i = 1; i < CARDS_QTY + 1; i++) {
            cards.cards.add(i);
        }
    }
    
    public int extractRandCard() {
        Random rand = new Random();
        int randIX = rand.nextInt(cards.cards.size());
        System.out.println("Random index " + randIX);
        return cards.cards.remove(randIX);
    }
    
    public int getSize() {
        return cards.cards.size();
    }
    
    @Override
    public String toString() {
        return "Deck:\n" + cards.toString();
    }
}
