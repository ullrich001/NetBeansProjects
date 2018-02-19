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
public abstract class FixedWing extends Aircraft{
    
    public FixedWing(){
        super();
    }
    
    @Override
    public void reportLiftType(){
        System.out.println("I am a fixed wing aircraft");
    }
    
}
