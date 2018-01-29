/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_a1blackjack;

/* Deck
-myCards : Card[51]
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
    
    private Card[] myCards = new Card[52];
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", 
        "10", "Jack", "Queen", "King"};
    private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private int nextCardIndex = 0;
    
    public Deck(){
        initDeck();
        shuffleDeck();
    }
     
   private void initDeck(){
        for(int i=0; i<myCards.length; i++){
                myCards[i] = new Card(ranks[i%13], suits[i/13]);
        }
    }
    
    private void shuffleDeck(){
        for(int i = 0; i<myCards.length; i++){
            Card temp = myCards[i];
            int randInt = (int)(Math.random() * 52); //output between 0 and 51
            myCards[i] = myCards[randInt];
            myCards[randInt] = temp;
        }
    }
    
    public Card dealCard(){
        if(nextCardIndex >= myCards.length){
            shuffleDeck();
            nextCardIndex = 0;
        }
        Card deal = myCards[nextCardIndex];
        nextCardIndex++;
        return deal;
    }
    
    public void printDeck(){
        for(int i = 0; i < myCards.length; i++){
            System.out.println(myCards[i].toString());
        }
    }
    
}
