/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_a1blackjack;

/* Dealer
-myDeck : Deck
-players : Player[]
-dealerHand : Hand
-currentPlayer : Player

+dealOpeningHand() : void
+playOutPlayerHands : void
+playOutDealerHand : void
+declareVictors : ???
*/

/**
 *
 * @author Danie
 */
public class Dealer {
    private Deck myDeck = new Deck();
    private Player[] players;
    private Hand dealerHand = new Hand();
    private Player currentPlayer;
    
    public Dealer( int numOfPlayers ){
        players = new Player[numOfPlayers];
    }
    
    public void dealOpeningHand(){
        for( int round = 0; round < 2; round++ ){
            for( int i = 0; i < players.length; i++ ){
                players[i].getHand().addCard(myDeck.dealCard());
            }
            dealerHand.addCard(myDeck.dealCard());
        }
    }
    
    public void playOutPlayerHands(){
        
    }
    
    public void playOutDealerHand(){
        
    }
    
    public void declareVictors(){
        
    }
}
