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
    
    public int extractCard(int cardToExtract) {
        for (Integer card : cards) {
            if (card == cardToExtract) {
                cards.remove(card);
                return card;
            }
        }
        
        return 0;
    }

    public ArrayList<Integer> copyCards() {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (Integer card : cards) {
            newArray.add(card);
        }
        
        return newArray;
    }

    @Override
    public String toString() {
        int i = 0;
        String result = "";
        for (Integer card : cards) {
            result += i + ". " + card + "\n";
            i++;
        }
        
        return result;
    }
}
