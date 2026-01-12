/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fool;

/**
 *
 * @author artyom
 */
public class Fool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();
        board.beats.add(new Beat(2));
        board.beats.add(new Beat(7));
        board.beats.add(new Beat(8));
        board.beats.add(new Beat(12));

        System.out.println(board.toString());
        
        Turn turn = new Turn(board);

        CardList hand = new CardList();
        
        hand.cards.add(1);
        hand.cards.add(9);
        hand.cards.add(10);
        hand.cards.add(13);

        for (Beat beat : turn.preboard.beats) {
            Controller controller = new Controller(beat.attack);

            try {
                beat.defend = controller.pickCard(hand);
                System.out.println("New beat is:\n" + beat.toString());
            } catch (Exception e) {
                System.out.println("Impossible to proceed");
            }

            System.out.println(turn.preboard.toString());
        }
    }
}
