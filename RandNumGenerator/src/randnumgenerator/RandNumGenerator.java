/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randnumgenerator;

/**
 *
 * @author Danie
 */
public class RandNumGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer[] arr = {1,2,3,4,5,6};
        
        h.pa(arr);
        
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            int randInt = (int)(Math.random()*arr.length);
            arr[i] = arr[randInt];
            arr[randInt] = temp;
        }
        
        h.pa(arr);
        
        /*
        Inside a for loop, dealing with each array entry
        Card temp = myCards[i],
        Int randInt = (int)(Math.rand() * 52) //output between 0 and 51
        myCards[i] = myCards[randInt] 
        myCards[randInt] = temp
        */
        
    }
    
}
