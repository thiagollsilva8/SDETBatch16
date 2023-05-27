package class07;

import java.util.Scanner;

public class E13WhileLoop13 {

    public static void main(String[] args) {

        // ask the user for a number than print all the numbers from 1 to that number

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number greater than 1");

        int lastNumber = input.nextInt();

        int counter = 1;

        while (counter <= lastNumber) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}
