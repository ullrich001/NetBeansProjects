/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_a1blackjack;

/* Hand
-myCards : Card[5]
-score : int
-cardCount : int

-updateScore() : int
+addCard(Card) : void
+getCardCount() : int
+getScore() : int
+printHand() : void
*/

/**
 *
 * @author Danie
 */
public class Hand {
    private Card[] myCards = new Card[5];
    private int score;
    private int cardCount;
    
    private int updateScore(){
        //score + [newCardValue]
        return score; 
    }
    
    public void addCard(Card newCard){
        //add new card object to myCards
        //cardCount++;
    }
    
    public int getCardCount(){
        return cardCount;
    }
    
    public int getScore(){
        return score;
    }
    
    public void printHand(){
//        //for() loop running Card.toString() for each object in myCards[]
    }
}
