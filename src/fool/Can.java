/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

/**
 *
 * @author artyom
 */
public class Can {
    public Beat beat;
    
    public Can(int attack) {
        this.beat = new Beat(attack);
    }
    
    public void defend(int defend) {
        this.beat.defend = defend;
    }
    
    public boolean able() {
        return beat.defend > beat.attack;
    }
}
