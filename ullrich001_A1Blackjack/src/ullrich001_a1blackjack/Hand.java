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

-updateScore() : void
+addCard(Card) : void
+getCardCount() : int
+getScore() : int
+printHand() : void
*/

/*Needs Done:
    updateScore; may need to alter Card to add score values.
*/

/**
 *
 * @author Danie
 */
public class Hand {
    private Card[] myCards = new Card[5];
    private int score = 0;
    private int cardCount = 0;
    
    public Hand(){}
    
    private void updateScore(){
        //score + [newCardValue] 
    }
    
    public void addCard(Card nextCard){
        if(cardCount > myCards.length){
            myCards[cardCount++] = nextCard;
            updateScore();
        }
    }
    
    public int getCardCount(){
        return cardCount;
    }
    
    public int getScore(){
        return score;
    }
    
    public void printHand(){
        for(int i = 0; i < myCards.length; i++){
            System.out.println(myCards[i].toString());
        }
    }
}
