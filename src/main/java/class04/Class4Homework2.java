package class04;

import java.util.Scanner;

/*
2) You are a loan specialist and you need to ask user what is the amount of loan
is needed. If loan is less or equal to 200,000 then you would lend the money
otherwise you would reject the client.
 */
public class Class4Homework2 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Please enter the amount of loan needed");
        double loanAmount = myscan.nextDouble();

        if (loanAmount <= 200000) {
            System.out.println("Loan approved!");
        } else {
            System.out.println("Loan rejected!");
        }
    }
}
