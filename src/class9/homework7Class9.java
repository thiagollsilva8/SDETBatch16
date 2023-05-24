package class9;

/*
From an array of integer elements find the largest number.
 */
public class homework7Class9 {

    public static void main(String[] args) {

        int [] numbers = {2, 156, 45, 100, 99};

        int largestNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println(largestNumber);
    }
}