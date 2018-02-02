/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_a1blackjack;

/**
 *
 * @author Danie
 */
public class Ullrich001_A1Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deck myDeck = new Deck();
        //myDeck.printDeck();
        Dealer fred = new Dealer(3);
        fred.dealOpeningHand();
        fred.playOutPlayerHands();
        fred.playOutDealerHand();
        fred.declareVictors();
    }
    
}
