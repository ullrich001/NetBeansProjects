/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_a1blackjack;

/* Deck
-myDeck : Card[51]
-suits : String[3]
-ranks : String[12]
-nextCardIndex : int

-initDeck() : void
-shuffleDeck() : void
+dealCard() : Card
+printDeck() : void
*/

/**
 *
 * @author Danie
 */
public class Deck {
    
    private Card[] myDeck = new Card[52];
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", 
        "10", "Jack", "Queen", "King"};
    private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private int nextCardIndex = 0;
    
    public Deck(){
        initDeck();
        shuffleDeck();
    }
     
   private void initDeck(){
        for( int i=0; i<myDeck.length; i++ ){
                Card cCard = new Card(ranks[i%13], suits[i/13]);
                myDeck[i] = cCard;
        }
    }
    
    private void shuffleDeck(){
        
        for(int i = 0; i<myDeck.length; i++){
            Card temp = myDeck[i];
            int randInt = (int)(Math.random() * 52); //output between 0 and 51
            myDeck[i] = myDeck[randInt];
            myDeck[randInt] = temp;
        }
        
    }
    
    public Card dealCard(){
        Card deal = myDeck[nextCardIndex];
        return deal; //Change to actual Card return
    }
    
    public void printDeck(){
        for( int i = 0; i < myDeck.length; i++){
            System.out.println(myDeck[i].toString());
        }
    }
    
}
