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
            if(turnCtr % 2 == 0){
                token = 'X';
            }else{
                token = 'O';
            }
            myBoard.addPiece(token);
            turnCtr++;
            if(myBoard.fullCheck()) break;
        }while(myBoard.winnerCheck() == ' ');
        if(myBoard.fullCheck()){
            System.out.println("FINAL BOARD:");
            myBoard.printBoard();
            System.out.println("It's a tie!");
        }else if(myBoard.winnerCheck() == 'X'){
            System.out.println("FINAL BOARD:");
            myBoard.printBoard();
            System.out.println("X Wins!");
        }else if(myBoard.winnerCheck() == 'O'){
            System.out.println("FINAL BOARD:");
            myBoard.printBoard();
            System.out.println("O Wins!");
        }else{
            System.out.println("ERROR HANDLER");
        }
    }
    

}
