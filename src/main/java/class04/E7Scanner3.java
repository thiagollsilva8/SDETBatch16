package class04;

import java.util.Scanner;

public class E7Scanner3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = input.next();

        if (name.equals("Elena")) {
            System.out.println("Mac user");
        } else if (name.equals("Safyan")) {
            System.out.println("Naughty");
        } else if (name.equals("Halima")) {
            System.out.println("Best");
        } else if (name.equals("Axel")) {
            System.out.println("Bad boy");
        }
    }
}
