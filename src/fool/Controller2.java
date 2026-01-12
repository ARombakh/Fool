/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

/**
 *
 * @author artyom
 */
public class Controller2 {
    public CardList attackcards;
    public int cardtest;
    
    public Controller2() {
        this.attackcards = new CardList();
    }
    
    @Override
    public String toString() {
        return attackcards.toString();
    }
}
