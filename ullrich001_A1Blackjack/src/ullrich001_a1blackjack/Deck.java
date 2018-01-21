/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_a1blackjack;

/*TODO
Populate ranks array with ranks
Assemble initDeck
Change dealCard return
*/

/**
 *
 * @author Danie
 */
public class Deck {
    
    private Card[] myDeck;
    private String[] ranks = {"Ace", "2", "3", "4"}; //Populate with ranks later
    private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private int nextCardIndex = 0;
    
    public Deck(){
        initDeck();
        shuffleDeck();
    }
    
    private void initDeck(){
        
    }
    
    private void shuffleDeck(){
        
    }
    
    public Card dealCard(){
        
        return null; //Change to actual Card return
    }
    
    public void printDeck(){
        for( int i = 0; i < myDeck.length; i++){
            System.out.println(myDeck[i].toString());
        }
    }
    
}
