package class7;

public class E10WhileLoop10 {

    public static void main(String[] args) {

        // 1 2 4 5 7 8 10 11 13 14 16 17 19 20 Hint modulus operator

        int number = 1;

        while (number <= 20) {

            if (number % 3 != 0) {
                System.out.print(number + " ");

            }
            number++;
        }
    }
}