/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

import java.util.Scanner;

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
    
    public int chooseTakeCardsTurn() throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int option;
        
        System.out.println("0. Take cards" +
                "1. Choose card to defend");
        
        option = sc.nextInt();
        
        switch (option) {
            case 0, 1:
                return option;
            default:
                System.out.println("Incorrect number, enter number 0 or 1");
                throw new AssertionError();
        }
    }
    
    public void makeTurn() throws Exception {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean chooseCard = false;
        for (Beat beat : preboard.beats) {

            while (!chooseCard) {        
                try {
                    option = chooseTakeCardsTurn();
                    chooseCard = true;
                } catch (Exception e) {
                    chooseCard = false;
                }
            }
 
            switch (option) {
                case 0:
                    throw new Exception("Take cards");
                case 1:
                    defendBeat(beat);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    public void defendBeat(Beat beat) throws Exception {
        Controller controller = new Controller(beat.attack);

        beat.defend = controller.pickCard(hand);
        System.out.println("New beat is:\n" + beat.toString());
        
        System.out.println(preboard.toString());
    }
}
