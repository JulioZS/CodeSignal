package interviews.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class firstDuplicate {

    /* Given an array a that contains only numbers in the range from 1 to a.length,
    find the first duplicate number for which the second occurrence has the minimal index.
    In other words, if there are more than 1 duplicated numbers, return the number for
    which the second occurrence has a smaller index than the second occurrence of the
    other number does. If there are no such elements, return -1.*/

    public static void main(int[] args) {

        int firstDuplicate = firstDuplicate(args);

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
