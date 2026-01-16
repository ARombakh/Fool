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
public class Player {
    public CardList cards;
    
    public Player() {
        this.cards = new CardList();
    }
    
    public void takeCard(int card){
        cards.addCard(card);
    }
    
    public void attackWithCard(int card) {
        cards.extractCard(card);
    }
    
    @Override
    public String toString() {
        return cards.toString();
    }
}
