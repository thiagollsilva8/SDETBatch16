package class04;

import java.util.Scanner;

public class E8Scanner4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your salary only numbers are allowed");

        // for int type of data we should be using nextInt() method

        int salary = input.nextInt();
        if (salary > 100000) {
            System.out.println("You are rich");
        } else {
            System.out.println("Look for better opportunities");
        }

    }
}
