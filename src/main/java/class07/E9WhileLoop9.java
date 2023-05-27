package class07;

public class E9WhileLoop9 {

    public static void main(String[] args) {

        // print 25 20 15 10 5 using a while loop
        // Remove number 15 :Hint using if conditions

        int number = 25;

        while (number >= 5) {

            if (number != 15) {

                System.out.print(number + " ");
            }
            number -= 5;
        }
    }
}