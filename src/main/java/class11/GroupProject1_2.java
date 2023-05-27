package class11;

/*
Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.
 */

public class GroupProject1_2 {

    public static void main(String[] args) {

        int [] numbers = {11, 23, 18, 1, 17, 6};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

    }
}
