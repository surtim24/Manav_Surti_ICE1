/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Manav Surti
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

      
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = scanner.nextInt();

        // Validate suitIndex
        if (suitIndex < 0 || suitIndex > 3) {
            System.out.println("Invalid suit! Please run the program again.");
            return;
        }

        String userSuit = Card.SUITS[suitIndex];

        // Check if the user's card is in the magic hand
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
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
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
