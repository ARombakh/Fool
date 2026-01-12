/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

/**
 *
 * @author artyom
 */
public class Controller {
    public CardList cardlist;
    
    public Controller() {
        this.cardlist = new CardList();
    }
    
    @Override
    public String toString() {
        return cardlist.toString();
    }
}
