package class09;

/*
Create an array on integers and calculate the sum of all elements in an array
 */
public class homework6Class9 {

    public static void main(String[] args) {

        int[] numbers = {2, 34, 56, 12, 83};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println(sum);
        }
    }
}
