/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_inheritanceexample;

/**
 *
 * @author Danie
 */
public class A6MZero extends SingleEngine{
    
    public A6MZero(){
        name = "A6M Zero";
    }
    
    @Override
    public void reportFactoid() {
        System.out.println("FACTOID NEEDED");
    }
    
}
