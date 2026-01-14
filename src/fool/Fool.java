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

        CardList hand = new CardList();
        
        hand.cards.add(1);
        hand.cards.add(9);
        hand.cards.add(10);
        hand.cards.add(13);
        
        Turn turn;
        
        CardList preHand = new CardList();
        
        preHand.cards = hand.copyCards();
        turn = new Turn(board, preHand);
        try {
            turn.makeTurn();
        } catch (Exception e) {
            
        }
    }
}
