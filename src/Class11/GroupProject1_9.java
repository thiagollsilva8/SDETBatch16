package Class11;

/*
Write a java program to find the second-largest
number in the array?
 */

public class GroupProject1_9 {

    public static void main(String[] args) {

        int[] numbers = {12, 34, 54, 11, 5, 53};

        int max  = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] > max) {
                secondLargest = max;
                max = numbers[i];
            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println(secondLargest);
    }
}
