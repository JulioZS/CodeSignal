package com.interviews.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rotateImage {

    /* Note: Try to solve this task in-place (with O(1) additional memory),
    since this is what you'll be asked to do during an interview.

    You are given an n x n 2D matrix that represents an image.
    Rotate the image by 90 degrees (clockwise). */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //allow user input;

        System.out.print("Enter 2D array size : ");

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        System.out.println("Enter array elements : ");

        int twoD[][]=new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for(int j = 0; j < columns; j++) {

                twoD[i][j] = sc.nextInt();
            }
        }

        System.out.println("Rotated image is: \n"  + Arrays.deepToString(rotateImage(twoD)));

    }

    public static int[][] rotateImage(int[][] a) {

     /* a = [[1, 2, 3],
            [4, 5, 6],
            [7, 8, 9]]

        rotateImage(a) =
            [[7, 4, 1],
            [8, 5, 2],
            [9, 6, 3]] */

        int[][] rotatedArray = new int[a.length][a.length];
        int M = a.length;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

              rotatedArray [j][M - 1 - i] = a[i][j];

            }

        }

        return rotatedArray;

    }
}
