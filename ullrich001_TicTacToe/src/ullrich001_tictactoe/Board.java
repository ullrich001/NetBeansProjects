/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ullrich001_tictactoe;

import java.util.Scanner;

/* Board
* -myBoard : char[][]
* -row : int
* -column : int
*
* +initBoard() : void
* +addPiece() : void
* +printBoard() : void
* +fullCheck() : boolean
* +winCheck() : boolean
*/

/**
 *
 * @author Danie
 */
public class Board {
    private char[][] myBoard = new char[3][3];
    private int row, column;
    
    public Board(){
        initBoard();
    }
    
    private void initBoard(){
        for(int i = 0; i < myBoard.length; i++){
            for( int j = 0; j < myBoard[i].length; j++){
                myBoard[i][j] = ' ';
            }
        }
    }
    
    public void playTurn(char pl){
        boolean valid = false;
        Scanner scan = new Scanner(System.in);
        while(!valid){
            this.printBoard();
            System.out.print("You are " + pl + ".\nWhat row would you like"
                    + " to place your piece in? (1-3): ");
            row = scan.nextInt();
            while(row < 1 || row > 3){
                System.out.println("Invalid. Please choose a number between 1 and 3: ");
                row = scan.nextInt();
            }
            System.out.print("What column? (1-3): ");
            column = scan.nextInt();
            while(column < 1 || column > 3){
                System.out.println("Invalid. Please choose a number between 1 and 3: ");
                column = scan.nextInt();
            }
            if(myBoard[row-1][column-1] == ' '){
                this.addPiece(row-1, column-1, pl);
                valid = true;
            } else {
                System.out.println("This space is full. Please try again.");
            }
        }
    }
    
    public void addPiece(int row, int column, char piece){
        myBoard[row][column] = piece;
    }
    
    public void printBoard(){
        int i = 0,
            j = 0;
        for( ; i < myBoard.length-1; i++){
            j = 0;
            for( ; j < myBoard[i].length-1; j++){
                System.out.print(myBoard[i][j] + "|");
            }
            System.out.println(myBoard[i][j]);
            System.out.println("_____");
        }
        j = 0;
        for( ; j < myBoard[i].length-1; j++){
            System.out.print(myBoard[i][j] + "|");
        }
        System.out.println(myBoard[i][j]);
    }
    
    public boolean fullCheck(){
        boolean fullCheck = true;
        for(int i = 0; i < myBoard.length; i++){
            for( int j = 0; j < myBoard[i].length; j++){
                if(myBoard[i][j] == ' '){
                    fullCheck = false;
                    break;
                } else {
                    fullCheck = true;
                }
            }
            if(!fullCheck) break;
        }
        return fullCheck;
    }
    
    public boolean winCheck(){
        char token = 'X';
        boolean win = false;
        for(int ctr = 0; ctr < 2; ctr++){
            for(row = 0; row < 3; row++){
                for(column = 0; column < 3; column++){
                    if(myBoard[row][column] == token){
                        win = true;
                    } else {
                        win = false;
                        break;
                    }
                }
                if(win) return true;
            }
            for(column = 0; column < 3; column++){
                for(row = 0; row < 3; row++){
                    if(myBoard[row][column] == token){
                        win = true;
                    } else {
                        win = false;
                        break;
                    }
                }
                if(win) return true;
            }
            if(myBoard[0][0] == token && myBoard[1][1] == token &&
                    myBoard[2][2] == token){
                return true;
            } else if(myBoard[0][2] == token && myBoard[1][1] ==
                    token && myBoard[2][0] == token){
                return true;
            }
            token = 'O';
        }
        return win;
    }
}