package class11;

/*
Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
 */

public class GroupProject1_3 {

    public static void main(String[] args) {

        int[][] numbers = {
                {11, 8, 83, 10},
                {2, 5, 23, 1},
                {17, 90, 12, 48}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }


    }
}
