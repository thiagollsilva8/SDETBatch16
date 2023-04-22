package Class10;

/*
Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only.
 */
public class Class10Homework5 {

    public static void main(String[] args) {

        int[][] numbers = {
                {2, 5, 7, 8},
                {9, 12, 14, 1},
                {11, 13, 10, 88}
        };

        int counter = 0;
        for (int[] row : numbers) {
            for (int num : row) {
                if (num%2==0) {
                    System.out.println(num);
                    counter++;
                }
            }
        }
    }
}
