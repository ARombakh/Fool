/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

/**
 *
 * @author artyom
 */
public class Turn {
    public Board preboard;
    public CardList hand;
    
    public Turn(Board board, CardList hand) {
        this.preboard = board;
        this.hand = hand;
    }
    
    public boolean makeTurn() {
        for (Beat beat : preboard.beats) {
            Controller controller = new Controller(beat.attack);

            try {
                beat.defend = controller.pickCard(hand);
                System.out.println("New beat is:\n" + beat.toString());
            } catch (Exception e) {
                System.out.println("Impossible to proceed");
                return false;
            }

            System.out.println(preboard.toString());
        }
        
        return true;
    }
}
