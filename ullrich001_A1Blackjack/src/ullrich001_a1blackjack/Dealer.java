/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_a1blackjack;

import java.util.Scanner;

/* Dealer
-myDeck : Deck
-players : Player[]
-dealerHand : Hand
-currentPlayer : Player

-initPlayers() : void
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
        initTestPlayers();
    }
    
    public Dealer(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter the number of players: ");
        int numOfPlayers = 0;
        try{ 
            numOfPlayers = Integer.parseInt(scan.next());
        }catch(NumberFormatException e){
            System.out.print("That's not a proper number, please try again: ");
            numOfPlayers = Integer.parseInt(scan.next());
        }
        players = new Player[numOfPlayers];
        initPlayers();
        System.out.print("\n\n");
        scan.close();
    }
    
    private void initPlayers(){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < players.length; i++){
            System.out.print("Please enter a name for player " + (i+1) + ": ");
            String name = scan.nextLine();
            players[i] = new Player("Player " + (i+1));
            
        }
        scan.close();
    }
    
    //initTestPlayers is for testing purposes)
    private void initTestPlayers(){
        for(int i = 0; i < players.length; i++){
            players[i] = new Player("Player " + (i+1));
        }
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
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < players.length; i++){
            Hand currentHand = players[i].getHand();
            System.out.println("Player: " + players[i].getName());
            currentHand.printHand();
            
            String answer = "y";
            
            while(answer.toLowerCase().equals("y")){
                if(currentHand.getCardCount() < 5 && currentHand.getScore() < 21){
                    System.out.print("Do you want a card? \"y\" for yes: ");
                    answer = scan.next();
                    if(answer.toLowerCase().equals("y")){
                        currentHand.addCard(myDeck.dealCard());
                        currentHand.printHand();
                    }
                }else answer = "n";
            }
            System.out.println("__________________________________________");
        }
        scan.close();
    }
    
    public void playOutDealerHand(){
        while(dealerHand.getScore() < 17 && dealerHand.getCardCount() < 5){
            dealerHand.addCard(myDeck.dealCard());
        }
    }
    
    public void declareVictors(){
        int dealerScore = dealerHand.getScore();
        boolean dealerHasFive = (dealerHand.getCardCount() == 5);
        System.out.println("Dealer Hand:");
        dealerHand.printHand();
        if(dealerScore > 21){
            System.out.println("THE DEALER HAS BUSTED");
        }
        
        for(Player currPlayer : players){ //for-each loop
            int currScore = currPlayer.getHand().getScore();
            boolean playerHasFive = (currPlayer.getHand().getCardCount() == 5);
            System.out.println(currPlayer.getName() +"'s Hand:");
            currPlayer.getHand().printHand();
            if(currScore > 21){
                System.out.println("You busted, " + currPlayer.getName());
            }else if(dealerScore > 21 && currScore < 21){
                System.out.println( currPlayer.getName() + ", you win!" );
            }else if(!dealerHasFive && playerHasFive && dealerScore != 21){
                System.out.println( currPlayer.getName() + ", you win!" );
            }else if(!dealerHasFive && !playerHasFive && currScore > dealerScore){
                System.out.println( currPlayer.getName() + ", you win!" );
            }else{
                System.out.println( currPlayer.getName() + ", you lose." );
            }
        }
    }
}
