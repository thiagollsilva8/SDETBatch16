package class6;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number: ");

        double number = input.nextDouble();
        double number2 = input.nextDouble();

        if (number > number2) {
            System.out.println(number);
        } else if (number == number2) {
            System.out.println("Number not valid");
        } else {
            System.out.println(number2);
        }
    }
}
