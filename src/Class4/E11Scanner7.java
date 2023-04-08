package Class4;

import java.util.Scanner;

public class E11Scanner7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        if we want to take a complete line from the user we
        should use nextLine method
         */

        String sentence = input.nextLine();
        System.out.println(sentence);
    }
}
