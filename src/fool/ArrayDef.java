/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

/**
 *
 * @author artyom
 */
public class ArrayDef {
    public CardList defend;
    
    public ArrayDef() {
        this.defend = new CardList();
    }
    
    @Override
    public String toString() {
        return defend.toString();
    }
}
