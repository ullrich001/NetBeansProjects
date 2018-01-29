/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_a1blackjack;

/* Card
-suit String
-rank String
*/

/**
 *
 * @author Danie
 */
public class Card {
    
    private String rank;
    private String suit;
    
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    public String getRank(){
        return rank;
    }
    
    public String getSuit(){
        return suit;
    }
    
    @Override
    public String toString(){
        return (rank + " of " + suit);
    }

    public int getValue(){
        if(rank.length() < 3){
            return Integer.parseInt(rank);
        }else if(rank.equals("Ace")){
            return 1;
        }else{
            return 10;
        }
    }
}
