package class4;

import java.util.Scanner;

public class E6Scanner2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = input.next();

        if (name.equals("Elena")) {
            System.out.println("Mac user");
        } else {
            System.out.println("Windows user");
        }
    }
}
