package class11;

/*
Write a java program to find the second-largest
number in the array?
 */

import java.util.Arrays;

public class GroupProject1_9 {

    public static void main(String[] args) {

        int[] numbers = {1002, 100, 12, 34, 54, 11, 5, 53, 10000};

        int largest = numbers[0];
        int secondLargest = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {

                secondLargest = largest;
                largest = numbers[i];

            } else if (numbers[i] > secondLargest && numbers[i] != largest) {

                secondLargest = numbers[i];
            }
        }

        System.out.println(secondLargest);

        System.out.println("-----------------------------");

        // In an interview this path is the easiest way to find the second-largest number.

        int num [] = {3, 2, 45, 6, 55, 100, 5};

        Arrays.sort(num);
        System.out.println(num[num.length - 2]);
    }
}
