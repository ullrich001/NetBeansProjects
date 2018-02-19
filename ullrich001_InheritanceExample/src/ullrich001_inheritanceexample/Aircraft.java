/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_inheritanceexample;

import java.util.Scanner;

/**
 *
 * @author Danie
 */
public abstract class Aircraft {
    
    protected String name;
    
    public Aircraft(){
        
    }
    
    public boolean guessMyName(){
        Scanner asker = new Scanner(System.in);
        System.out.println( "What's my name?" );
        String answer = asker.nextLine();
        
        if(name.equals(answer)){
            System.out.println("You guesed right!");
            return true;
        }
        System.out.println("Nope!");
        return false;
    }
    
    public abstract void reportLiftType();
    public abstract void reportPropulsionType();
    public abstract void reportVariant();
    public abstract void reportFactoid();
}
