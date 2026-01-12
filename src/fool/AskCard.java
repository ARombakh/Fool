/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

import java.util.Scanner;

/**
 *
 * @author artyom
 */
public class AskCard {
    public CardList cardlist;
    
    public AskCard(CardList cards) {
        this.cardlist = cards;
    }
    
    public int chooseCard() {
        int chosenCardIx;
        
        System.out.println("Choose card number: ");
        
        System.out.println(cardlist.toString());
        
        Scanner sc = new Scanner(System.in);
        
        chosenCardIx = sc.nextInt();
        
        return cardlist.cards.get(chosenCardIx);
    }
}
