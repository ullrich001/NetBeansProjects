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
public class GuessThePlane {
    
    Aircraft[] planes = new Aircraft[16];
    
    private int score = 5;
    
    public GuessThePlane(){
        initPlanes();
        shufflePlanes();
        playGame();
    }
    
    private void initPlanes(){
        //Create one of each concrete aircraft object
        P51Mustang mustang = new P51Mustang();
        A6MZero zero = new A6MZero();
        
        //put aircraft objects in planes[]
        planes[0] = mustang;
    }
    
    private void shufflePlanes(){
        //Shuffle planes array
    }
    
    private void playGame(){
        boolean hasGuessedIt = false;
        Scanner hearer = new Scanner(System.in);
        
        //get a random aircraft object from planes[]
        //Temporary
        Aircraft unknownAircraft = planes[0];
        //end temporary
        //
        while(!hasGuessedIt){
            System.out.println("Want a clue? y/n");
            char answer = hearer.next().toLowerCase().charAt(0);
            if(answer == 'y'){
                giveClue(unknownAircraft);
                score--;
            }else{
               hasGuessedIt = unknownAircraft.guessMyName();
               score--;
            }
        }
        
        System.out.println("You scored " + score + " points.");
    }
    
    private void giveClue(Aircraft ufo){
        Scanner input = new Scanner(System.in);
        System.out.print(""
                + "What do you want to know?\n"
                + "1. Wing Type?\n"
                + "2. Propuslion Type?\n"
                + "3. Category?\n"
                + "4. Variant Factoid?\n"
                + "Please Select Option: ");
        char choice = input.next().charAt(0);
        switch(choice){
            case '1':   ufo.reportLiftType();
                        break;
            case '2':   ufo.reportPropulsionType();
                        break;
            case '3':   ufo.reportVariant();
                        break;
            case '4':   ufo.reportFactoid();
                        break;
            default:    System.out.println("That's not a valid choice");
        }
    }
    
}
