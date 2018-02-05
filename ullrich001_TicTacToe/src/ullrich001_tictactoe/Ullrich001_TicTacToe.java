/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_tictactoe;

/**
 *
 * @author Danie
 */
public class Ullrich001_TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board myBoard = new Board();
        int ctr = 0;
        char piece;
        while(!myBoard.checkIfFull()){
            if(ctr % 2 == 0){
                piece = 'X';
            } else {
                piece = 'O';
            }
            myBoard.playTurn(piece);
            ctr++;
        }
        System.out.println("Final Board:");
        myBoard.printBoard();
    }
    
}
