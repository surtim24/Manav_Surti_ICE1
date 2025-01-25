/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @modifier Manav Surti
 * Student ID: 991751130
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]); 
            magicHand[i] = c;
            
            //c.setValue(insert call to random number generator here)
        
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        }
        System.out.println("Your magic hand:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        Card luckycard=new Card();
        luckycard.setValue(5);
        luckycard.setSuit("spades");
        

        // Check if the user's card is in the magic hand
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckycard.getValue() && card.getSuit().equals(luckycard.getSuit())) {
                cardFound = true;
                break;
            }
        }

        // Report result
        if (cardFound) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        
        

    }
    
}
