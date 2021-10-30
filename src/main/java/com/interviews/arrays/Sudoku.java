package com.interviews.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Sudoku {

    /* Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers
    in such a way that each column, each row, and each of the nine 3 × 3 sub-grids that compose
    the grid all contain all of the numbers from 1 to 9 one time.

    Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku
    puzzle according to the layout rules described above. Note that the puzzle represented by grid
    does not have to be solvable. */


    /* grid (9x9) =
            [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
            ['.', '.', '6', '.', '.', '.', '.', '.', '.'],
            ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
            ['.', '.', '1', '.', '.', '.', '.', '.', '.'],
            ['.', '6', '7', '.', '.', '.', '.', '.', '9'],
            ['.', '.', '.', '.', '.', '.', '8', '1', '.'],
            ['.', '3', '.', '.', '.', '.', '.', '.', '6'],
            ['.', '.', '.', '.', '.', '7', '.', '.', '.'],
            ['.', '.', '.', '5', '.', '.', '.', '7', '.']]

     */

    public static boolean isValidSudoku(char[][] grid) {

        // 1. Check for duplicates
        HashSet<Character> hashSetBlock1 = new HashSet<>();
        HashSet<Character> hashSetBlock2 = new HashSet<>();
        HashSet<Character> hashSetBlock3 = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {

            // 1.1 Check rows
            HashSet<Character> hashSetRows = new HashSet<>();

            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] != '.' && !hashSetRows.add(grid[i][j])) {
                    return false;
                }
            }

            // 1.2 Check columns
            HashSet<Character> hashSetColumns = new HashSet<>();

            for (int j = 0; j < grid[i].length; j++) {

                if(grid[j][i] != '.' && !hashSetColumns.add(grid[j][i])) {
                    return false;
                }

            }

            // 1.3 Check 3x3 quadrants
            for (int j = 0; j < grid[i].length*1/3; j++) {
                if (grid[i][j] != '.' && !hashSetBlock1.add(grid[i][j])) {
                    return false;
                }
            }

            for (int j = 3; j < grid[i].length*2/3; j++) {
                if (grid[i][j] != '.' && !hashSetBlock2.add(grid[i][j])) {
                    return false;
                }
            }

            for (int j = 6; j < grid[i].length; j++) {
                if (grid[i][j] != '.' && !hashSetBlock3.add(grid[i][j])) {
                    return false;
                }
            }

            if (i == 2 || i == 5) {
                hashSetBlock1.clear();
                hashSetBlock2.clear();
                hashSetBlock3.clear();
            }

        }

        return true;

    }

}
