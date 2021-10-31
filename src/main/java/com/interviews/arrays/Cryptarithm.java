package com.interviews.arrays;

import java.util.ArrayList;

public class Cryptarithm {

    /* A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence
    between letters and digits, such that the given arithmetic equation consisting of
    letters holds true when the letters are converted to digits. */

    public boolean isCryptSolution(String[] crypt, char[][] solution) {

        /* You have an array of strings crypt, the cryptarithm, and an an array containing
        the mapping of letters and digits, solution. The array crypt will contain three
        non-empty strings that follow the structure: [word1, word2, word3], which should
        be interpreted as the word1 + word2 = word3 cryptarithm. */

        /* When you decrypt "SEND", "MORE", and "MONEY" using the mapping given in crypt,
        you get 9567 + 1085 = 10652 which is correct and a valid arithmetic equation. */

        ArrayList<StringBuilder> wordsToNumbers = new ArrayList<>();
        StringBuilder wordToNumber;

        for (int i = 0; i < crypt.length; i++) {

            wordToNumber = mapWordToNumber(crypt[i], solution);

            if (!isValidCountWord((wordToNumber))) {
                return false;
            }

            wordsToNumbers.add(wordToNumber);

        }

        // Check final result
        if (Long.parseLong(wordsToNumbers.get(0).toString()) + Long.parseLong(wordsToNumbers.get(1).toString()) == Long.parseLong(wordsToNumbers.get(2).toString())) {
            return true;
        }

        return false;

    }


    private boolean isValidCountWord(StringBuilder countWord) {

        Character invalidCharacter = '0';
        Character firstCharacter = countWord.charAt(0);

        if (invalidCharacter.equals(firstCharacter) && countWord.length() > 1) {
            return false;
        }

        return true;

    }

    private StringBuilder mapWordToNumber(String word, char[][] solution) {

        StringBuilder wordToNumber = new StringBuilder();

        for (Character character : word.toCharArray()) {

            for (int i = 0; i < solution.length; i++) {

                if (character.equals(solution[i][0])) {

                    wordToNumber.append(solution[i][1]);

                }
            }
        }

        return wordToNumber;

    }

}
