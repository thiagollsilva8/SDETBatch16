package class4;

import java.util.Scanner;

public class E9Scanner5 {

    public static void main(String[] args) {

        // Break till 1:53

        Scanner input = new Scanner(System.in);
        System.out.println("Are you Hungry Enter true/false");

        boolean hungry = input.nextBoolean();

        if (hungry) {
            System.out.println("Let's order Pizza");
        } else {
            System.out.println("Let's practice java");
        }

    }
}
