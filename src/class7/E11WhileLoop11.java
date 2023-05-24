package class7;

public class E11WhileLoop11 {

    public static void main(String[] args) {

        /*
        Print numbers from 100 to 1
        Print even numbers from 20 to 100
        Print only odd numbers from 100 to 1
         */

        int counter = 100;

        while (counter > 0) { // same as writing (counter >= 1)
            System.out.print(counter + " ");
            counter--;
        }

        // assigning a new value to the counter for next loop

        counter = 20;
        System.out.println(); // This is used to put the next counter in a different line

        while (counter <= 100) {
            System.out.print(counter + " ");
            counter += 2;
        }

        counter = 100;
        System.out.println(); // so that we can see the next output on a new line

        while (counter >= 1) {

            // odd numbers when divided by 2 gives 1 as remainder

            if (counter % 2 == 1) { // its as (counter %2 !=0)
                System.out.print(counter + " ");
            }
            counter--;
        }
    }
}
