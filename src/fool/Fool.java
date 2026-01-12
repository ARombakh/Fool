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
        hand.cards.add(11);
        hand.cards.add(13);
        
        System.out.println(turn.preboard.toString());
        
        for (Beat beat : turn.preboard.beats) {
            Controller controller = new Controller(beat);

            ArrayDef arraydef = new ArrayDef();

            Can can = new Can(controller.beat);

            for (Integer card : hand.cards) {
                can.beat.defend = card;
                
                if (can.able()) {
                    arraydef.defend.cards.add(card);
                }
            }

            System.out.println(arraydef.toString());

            AskCard askcard = new AskCard(arraydef.defend);

            beat.defend = 
                    hand.extractCard(askcard.chooseCard());

            System.out.println(turn.preboard.toString());
        }
    }
}
