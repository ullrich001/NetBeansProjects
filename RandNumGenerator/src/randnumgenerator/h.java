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
public class h {
    
    public static void pl(Object obj){
        System.out.println(obj.toString());
    }
    
    public static void ps(Object obj){
        System.out.print(obj.toString());
    }
    
    public static void pf(Object obj){
        System.out.printf(obj.toString());
    }
    
    public static void pa(Object[] arr){
        for(int i = 0; i<arr.length; i++){
            ps(arr[i] + " | ");
        }
        ps("\n");
    }
    
}
