package Class10;

/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
 */
public class Class11Homework4 {

    public static void main(String[] args) {



        int[][] numbers = {
                {3, 5, 9},
                {65, 2, 14},
                {12, 10, 4}
        };

        int sum = 0;
        for (int[] row : numbers) {
            for (int num : row) {
                sum+=num;
            }
        }
        System.out.println(sum);
   }

}




