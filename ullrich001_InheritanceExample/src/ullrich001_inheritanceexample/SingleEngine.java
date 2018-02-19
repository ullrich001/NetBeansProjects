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
public abstract class SingleEngine extends PropellerPlane{

    @Override
    public void reportVariant() {
        System.out.println("I use a single engine!");
    }

}
