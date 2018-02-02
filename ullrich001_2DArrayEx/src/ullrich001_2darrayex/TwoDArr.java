/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_2darrayex;

/**
 *
 * @author Danie
 */
public class TwoDArr {
    
    private char[][] myArr = new char[3][3];
    
    public TwoDArr(){}
    
    public void fillArr(){
        int index = 65;
        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){ 
                myArr[i][j] = (char)(index++);
            }
        }
    }
    
    public void printArr(){
        for(int i = 0; i < myArr.length; i++){
            String rowStr = "";
            for(int j = 0; j < myArr[i].length; j++){
                rowStr += myArr[i][j] + " | ";
            }
            System.out.println(rowStr);
        }
    }
    
}
