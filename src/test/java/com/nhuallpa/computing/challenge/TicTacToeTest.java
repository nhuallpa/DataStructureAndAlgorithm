package com.nhuallpa.computing.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    public void winnerNone() {
         String[][] board = new String[][] {
                 new String[] { "x", " ", "o"},
                 new String[] { " ", " ", " "},
                 new String[] { "x", "o", "x"}
         };
         assertEquals("none", TicTacToe.winnerOf(board));
    }

    @Test
    public void winnerX1() {
         String[][] board = new String[][] {
                 new String[] { "x", "x", "x"},
                 new String[] { " ", "o ", " "},
                 new String[] { "x", "o", "o"}
         };
         assertEquals("x", TicTacToe.winnerOf(board));
    }

    @Test
    public void winnerODiaganolly() {
        String[][] board = new String[][] {
                new String[] { "o", "x", "x"},
                new String[] { " ", "o", " "},
                new String[] { "x", "o", "o"}
        };
        assertEquals("o", TicTacToe.winnerOf(board));
    }


}