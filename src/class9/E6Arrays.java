package class9;

public class E6Arrays {

    public static void main(String[] args) {

        /*
        Create an array store 10, 50, 60, 45, 100 then print elements which
        are present on odd indexes.
        expected are 50, 45
         */

        int [] numbers = {10, 50, 60, 45, 100};

        for (int i = 1; i < numbers.length; i+=2) {
            System.out.println(numbers[i]);

        }
    }
}
