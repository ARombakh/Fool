/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

import java.util.ArrayList;

/**
 *
 * @author artyom
 */
public class CardList {
    public ArrayList<Integer> cards;
    
    public CardList() {
        this.cards = new ArrayList<>();
    }
    
    public boolean extractCard(int card) {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i) == card) {
                cards.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    public void addCard(int card) {
        cards.add(card);
    }
    
    @Override
    public String toString() {
        String output = "";
        for (Integer card : cards) {
            output += card + "\n";
        }
        
        return output;
    }
}