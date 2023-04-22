package Class10;

public class E4Arrays2D {

    public static void main(String[] args) {

        /*
        Whenever we repeat the code we should replace it with a loop
         */

        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };


        for (int j = 0; j < matrix.length; j++) {
            // getting the complete 1D array from the 2D array
            int[] arr1 = matrix[j];
            for (int i = 0; i < arr1.length; i++) {
                // going over all the elements from the 1D array
                System.out.print(arr1[i] + " ");
            }
            // print all rows in one line
            System.out.println();
        }
    }
}
