/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_tictactoe;

/* TurnHandler
* -row : int
* -col : int
* -turnCtr : int
* -token : char
* -myBoard : Board
*
* +startTurns() : void
*/

/**
 *
 * @author Danie
 */
public class TurnHandler {
    private int row, col;
    private int turnCtr = 0;
    private char token = 'X';
    private Board myBoard = new Board();
    
    public void initTurns(){
        do{
            
            if(myBoard.fullCheck()) break;
        } while(myBoard.winCheck());
    }
    

}
