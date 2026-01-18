/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fool;

/**
 *
 * @author artyom
 */
public final class Card implements Comparable<Card> {
    
    public enum Rank {
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }
    
    public enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS
    }
    
    public final Rank rank;
    public final Suit suit;
    
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public static Comparator<Card> withTrump (Suit trump) {
        return new Comparartor<Card> {
        
        };
    }
    
    public static void main(String[] args) {
        Card card = new Card(Rank.JACK, Card.Suit.CLUBS);
        Card card1 = new Card(Rank.QUEEN, Card.Suit.CLUBS);
        
        System.out.println(card1.compareTo(card));
    }
}
