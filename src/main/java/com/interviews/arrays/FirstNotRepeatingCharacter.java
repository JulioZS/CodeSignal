package com.interviews.arrays;

import java.util.Scanner;
import java.util.TreeMap;

public class FirstNotRepeatingCharacter {

    /* Given a string s consisting of small English letters, find and return the first instance
    of a non-repeating character in it. If there is no such character, return '_'.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //allow user input;
        System.out.println("Enter a word");
        String word = sc.nextLine();

        char firstDuplicate = firstNotRepeatingCharacter(word);

        System.out.println("the first instance\n" +
                "    of a non-repeating character is: " + firstDuplicate);

    }

    public static char firstNotRepeatingCharacter(String word) {

        /* For s = "abacabad", the output should be
        firstNotRepeatingCharacter(s) = 'c'.*/

        TreeMap<Character, Integer> repeatingTreeMap = new TreeMap<>();

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            repeatingTreeMap.put(c, repeatingTreeMap.getOrDefault(c, 0) + 1);

        }

        for (int j = 0; j < word.length(); j++) {

            if (repeatingTreeMap.get(word.charAt(j)) == 1) {
                return word.charAt(j);
            }

        }

        return '_';

    }

}
