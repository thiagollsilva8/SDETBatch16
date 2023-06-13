package class30;

public class E10Methods {

    public static void main(String[] args) {

         /*
        create a method that will take an array of ints and will return the sum
        of the elements of the array. Method should be accessible throughout the project,
        and method should be callable by just writing the name of the class.
         */

    }

    public static int SumArr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
