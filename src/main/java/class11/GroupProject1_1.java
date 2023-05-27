package class11;

/*
 Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.

 */

import java.util.Scanner;

public class GroupProject1_1 {

    public static void main(String[] args) {

        int[] temperatures = new int[7];
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter the temperature " + (i+1)+": ");
            temperatures[i] = input.nextInt();
        }


        int highest = temperatures[0];
        int lowest = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }


        System.out.println("Highest temperature for the week is " + highest);
        System.out.println("Lowest temperature for the week is " + lowest);
    }
}
