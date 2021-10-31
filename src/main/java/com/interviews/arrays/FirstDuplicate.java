package com.interviews.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicate {

    /* Given an array a that contains only numbers in the range from 1 to a.length,
    find the first duplicate number for which the second occurrence has the minimal index.
    In other words, if there are more than 1 duplicated numbers, return the number for
    which the second occurrence has a smaller index than the second occurrence of the
    other number does. If there are no such elements, return -1.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //allow user input;
        System.out.println("How many numbers do you want to enter?");
        int num = sc.nextInt();

        int[] array = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
            array[i] = sc.nextInt();
        }

        int firstDuplicate = firstDuplicate(array);

        System.out.println("The first duplicate number for which the second occurrence " +
                "has the minimal index is: " + firstDuplicate);

    }

    public static int firstDuplicate(int[] a) {

        // For a = [2, 1, 3, 5, 3, 2], the output should be firstDuplicate(a) = 3.

        HashSet<Integer> hashSet = new HashSet<>();

        for (int element : a) {

            if(!hashSet.add(element)) {
                return element;
            }
        }

        return -1;
    }
}
