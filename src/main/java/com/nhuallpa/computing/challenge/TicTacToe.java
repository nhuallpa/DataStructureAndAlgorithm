package com.nhuallpa.computing.challenge;

/*
 * Design an algorithm that determines if someone has won in a game of tic-tac-toe
 *
 * 3x3 board
 *
 * Win condition: 3 of the same symbol vertically, diaganolly, or horizontally
 *
 * Examples:
 *
 * x | x | x                     x | o | o                     x | o | o
 * o | - | -                     x | - | -                     - | x | -
 * o | - | -                     x | - | -                     - | - | x
 *
 * x is the winner               x is the winner               x is the winner
 */
public class TicTacToe {

    public static String winnerOf(String[][] board) {
        var winner = "none";

        // horizonatally check
        for (int i=0; i<board.length; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                winner = board[i][0];
            }
        }

        // vertically
        for (int i=0; i<board.length; i++) {
            if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
                winner = board[0][i];
            }
        }

        // diaganolly
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
            winner = board[0][0];
        }
        if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
            winner = board[0][2];
        }

        return (winner.equals("x") || winner.equals("o"))?winner:"none";
    }
}
