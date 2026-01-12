/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

/**
 *
 * @author artyom
 */
public class Beat {
    public int attack;
    public int defend;
    
    public Beat(int attack) {
        this.attack = attack;
    }
    
    public String toString() {
        return "Attacking: " + attack + " Defending: " + defend + "\n";
    }
}
