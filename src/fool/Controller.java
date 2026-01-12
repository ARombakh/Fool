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
    
    public Controller(int attack) {
        this.beat = new Beat(attack);
    }
    
    public int pickCard (CardList hand) throws Exception {
        ArrayDef arraydef = new ArrayDef();

        Can can = new Can(beat);
        
        System.out.println("Beat to defend:");
        System.out.println(toString());

        for (Integer card : hand.cards) {
            can.beat.defend = card;

            if (can.able()) {
                arraydef.defend.cards.add(card);
            }
        }
        
        if (arraydef.defend.cards.isEmpty()) {
            throw new Exception("No cards to defend");
        }

        AskCard askcard = new AskCard(arraydef.defend);

        beat.defend = 
                hand.extractCard(askcard.chooseCard());
        
        return beat.defend;
    }
    
    @Override
    public String toString() {
        return beat.toString();
    }
}
