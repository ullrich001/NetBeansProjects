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
public class P51Mustang extends SingleEngine{
    
    public P51Mustang(){
        name = "P-51 Mustang";
    }
    
    @Override
    public void reportFactoid(){
        System.out.println("I was flown by a Tuskeegee Airman, with a big red tail");
    }
}
