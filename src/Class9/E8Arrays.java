package Class9;

public class E8Arrays {

    public static void main(String[] args) {

        /*
        print all the numbers from 6 to 0 in reverse order
        6 5 4 3 2 1 0
         */

        int [] numbers = {0, 1, 2, 3, 4, 5, 6};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }

        System.out.println();

        char [] letters = {'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = letters.length - 1; i >= 0 ; i--) {
            System.out.print(letters[i]+" ");
        }
    }
}
