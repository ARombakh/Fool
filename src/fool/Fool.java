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
        
        Controller controller = new Controller();
        
        for (Beat beat : turn.preboard.beats) {
            controller.cardlist.cards.add(beat.attack);
        }

        CardList hand = new CardList();
        
        hand.cards.add(1);
        hand.cards.add(9);
        hand.cards.add(10);
        hand.cards.add(13);
        
        Controller2 controller2 = new Controller2();
        
        controller2.attackcards = controller.cardlist;

        ArrayDef arraydef = new ArrayDef();

        Can can = new Can(controller2.attackcards.cards.get(0));
        
        for (Integer card : hand.cards) {
            controller2.cardtest = card;
            can.beat.defend = controller2.cardtest;

            if (can.able()) {
                arraydef.defend.cards.add(controller2.cardtest);
            }
        }
        
        System.out.println(arraydef.toString());
        
        AskCard askcard = new AskCard(arraydef.defend);
        
        hand.extractCard(askcard.chooseCard());
        
        System.out.println("Hand Left");
        
        System.out.println(hand.toString());
    }
}
