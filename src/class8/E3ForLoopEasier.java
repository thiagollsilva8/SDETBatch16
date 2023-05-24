package class8;

public class E3ForLoopEasier {

    public static void main(String[] args) {

        // write a loop to add all the even numbers from 1 to 30

        int sum = 0;
        for (int i = 2; i <= 30; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to 30: " + sum);
    }

}
