package class11;

/*
Maximum and minimum number in the array?

 */

public class GroupProject1_8 {

    public static void main(String[] args) {

        int[] numbers = {12, 25, 1, 45, 87, 3, 0};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];

            } else if (numbers[i] < min) {

                min = numbers[i];
            }

        }
        System.out.println(min);
        System.out.println(max);

    }
}
