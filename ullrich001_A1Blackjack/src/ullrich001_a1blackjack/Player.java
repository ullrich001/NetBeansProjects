/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_a1blackjack;

/* Player
-myHand : Hand
-name : String

+getHand() : Hand
+getName() : Name
*/

/**
 *
 * @author Danie
 */
public class Player {
    private Hand myHand;
    private String name;
    
    public Player(String name){
        myHand = new Hand();
        this.name = name;
    }
    
    public Hand getHand(){
        return myHand;
    }
    
    public String getName(){
        return name;
    }
}
