package Class11;

public class E5Array2D {

    public static void main(String[] args) {


        int[][] arr2D = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        // with the help of loop count how many numbers in above array are even

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                int element = arr2D[i][j];
                if (element % 2 == 0) {
                    System.out.print(element+" ");

                }
            }
        }
        int counter = 0;
        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {

                if(num%2==0) {
                    counter++;
                    System.out.print(num+" ");
                }

            }

        }
    }
}
