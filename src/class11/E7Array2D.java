package class11;

public class E7Array2D {

    public static void main(String[] args) {

        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}

        };
        // With the help of loops count how many times we have true in above 2D Array

        // Fibonacci sequence - 0 1 1 2 3 5 8 13 21 34 ...

        int counter = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean bool : arr1D) {
                if (bool == true) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}


