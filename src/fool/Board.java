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
public class Board {
    public ArrayList<Beat> beats;
    
    public Board() {
        this.beats = new ArrayList<>();
    }
    
    public String toString() {
        int j = 0;
        String result = "";
        for (Beat beat : beats) {
            result += j + ". " + beat.toString();
            j++;
        }
        
        return result;
    }
}
