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
    public Beat beat;
    
    public Controller(Beat beat) {
        this.beat = beat;
    }
    
    @Override
    public String toString() {
        return beat.toString();
    }
}
