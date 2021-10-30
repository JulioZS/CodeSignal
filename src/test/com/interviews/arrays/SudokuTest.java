package com.interviews.arrays;

import org.junit.jupiter.api.Test;

import static com.interviews.arrays.Sudoku.isValidSudoku;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SudokuTest {

    @Test
    public void isValidSudokuTest () {

        // Create Test Sudokus
        char[][] array = {{'.','.','.','1','4','.','.','2','.'},
                          {'.','.','6','.','.','.','.','.','.'},
                          {'.','.','.','.','.','.','.','.','.'},
                          {'.','.','1','.','.','.','.','.','.'},
                          {'.','6','7','.','.','.','.','.','9'},
                          {'.','.','.','.','.','.','8','1','.'},
                          {'.','3','.','.','.','.','.','.','6'},
                          {'.','.','.','.','.','7','.','.','.'},
                          {'.','.','.','5','.','.','.','7','.'}};
        
        char[][] array2 = {{'.','4','.','.','.','.','.','.','.'}, 
                           {'.','.','4','.','.','.','.','.','.'},
                           {'.','.','.','1','.','.','7','.','.'},
                           {'.','.','.','.','.','.','.','.','.'},
                           {'.','.','.','3','.','.','.','6','.'},
                           {'.','.','.','.','.','6','.','9','.'},
                           {'.','.','.','.','1','.','.','.','.'},
                           {'.','.','.','.','.','.','2','.','.'},
                           {'.','.','.','8','.','.','.','.','.'}};

        // Perform Actions
        boolean expected = isValidSudoku(array);
        boolean expected2 = isValidSudoku(array2);

        // Compare expected vs actual
        assertEquals(expected, true);
        assertEquals(expected2, false);

    }

}