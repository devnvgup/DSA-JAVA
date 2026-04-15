package com.example;

import java.util.*;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        // each rơw unique 1 -> 9
        // each col unique 1 -> 9
        // 3 x 3 => unique 1 -> 9
        // return true
        // check row
        List<Character> tmp1 = new ArrayList<>();
        List<Character> tmp2 = new ArrayList<>();
        List<Character> tmp3 = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            List<Character> arrTmp = new ArrayList<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;
                if (arrTmp.contains(board[i][j])) {
                    return false;
                }
                arrTmp.add(board[i][j]);
                if (j <= 2 && j >= 0) {
                    if (tmp1.contains(board[i][j])) {
                        return false;
                    }
                    tmp1.add(board[i][j]);
                } else if (j <= 5 && j > 2) {
                    if (tmp2.contains(board[i][j])) {
                        return false;
                    }
                    tmp2.add(board[i][j]);
                } else {
                    if (tmp3.contains(board[i][j])) {
                        return false;
                    }
                    tmp3.add(board[i][j]);
                }
            }
            if (i == 2 || i == 5 || i == 8) {
                tmp1.clear();
                tmp2.clear();
                tmp3.clear();
            }
        }
        // check col
        // for (int i = 0; i < board[0].length; i++) {
        //     List<Character> arrTmp = new ArrayList<>();
        //     for (int j = 0; j < board.length; j++) {
        //         if (board[j][i] == '.') continue;
        //         if (arrTmp.contains(board[j][i])) {
        //             return false;
        //         }
        //         arrTmp.add(board[j][i]);
        //     }
        // }
        // check 3 x 3

        return true;
    }
    // 00 01 02 03 04 05 06 07 08
    // 11 11 12 13 14 15 16 17 18
    // 20 21 22. 23 24 25. 26 27 28

    // 30 31 32. 33 34 35 36 37 38
    // 40 41 42. 43 44 45 46 47 48
    // 50 51 52. 53 54 55. 56 57 58

    // 60 61 62. 63 64 65 66 67 68
    // 70 71 72. 73 74 75. 76 77 78
    // 80 81 82. 83 84 85. 86 87 88

    // 01 02 .....
    // 11 21 .....
    // 21 31 .....
    // .......
}