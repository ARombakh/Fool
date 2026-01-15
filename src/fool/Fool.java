/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

/**
 *
 * @author artyom
 */
public class Fool {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        for (Integer card : deck.cards.cards) {
            System.out.println(card);
        }
        
        deck.extractCard(5);
        
        for (Integer card : deck.cards.cards) {
            System.out.println(card);
        }
    }
}