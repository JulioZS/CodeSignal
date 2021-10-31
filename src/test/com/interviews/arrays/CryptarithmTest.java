package com.interviews.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptarithmTest {

    Cryptarithm cryptarithm = new Cryptarithm();
    String[] crypt;
    char[][] solution;

    @Test
    public void isCryptSolutionTrueTest() {

        crypt = new String[] {"SEND", "MORE", "MONEY"};

        solution = new char[][] {{'O', '0'},
                                 {'M', '1'},
                                 {'Y', '2'},
                                 {'E', '5'},
                                 {'N', '6'},
                                 {'D', '7'},
                                 {'R', '8'},
                                 {'S', '9'}};

        Boolean isCryptSolution = cryptarithm.isCryptSolution(crypt, solution);

        assertEquals(isCryptSolution, true);

    }

    @Test
    public void isCryptSolutionTrueSecondTest() {

        crypt = new String[] {"AAAAAAAAAAAAAA", "BBBBBBBBBBBBBB", "CCCCCCCCCCCCCC"};

        solution = new char[][] {{'A', '1'},
                                 {'B', '2'},
                                 {'C', '3'}};

        Boolean isCryptSolution = cryptarithm.isCryptSolution(crypt, solution);

        assertEquals(isCryptSolution, true);

    }


    @Test
    public void isCryptSolutionFalseTest() {

        crypt = new String[] {"TEN", "TWO", "ONE"};

        solution = new char[][] {{'O', '1'},
                                 {'T', '0'},
                                 {'W', '9'},
                                 {'E', '5'},
                                 {'N', '4'}};


        Boolean isCryptSolution = cryptarithm.isCryptSolution(crypt, solution);

        assertEquals(isCryptSolution, false);

    }

    @Test
    public void isCryptSolutionFalseSecondTest() {

        crypt = new String[] {"A", "A", "A"};

        solution = new char[][] {{'A', '0'}};

        Boolean isCryptSolution = cryptarithm.isCryptSolution(crypt, solution);

        assertEquals(isCryptSolution, true);

    }



}
