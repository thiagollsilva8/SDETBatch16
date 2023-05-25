package class08;

public class E11NestedLoop6 {

    // use one while and one for loop 1:59
    /*
    2 4 6 8 10
    2 4 6 8 10
    2 4 6 8 10
    2 4 6 8 10
     */
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 4) {
            for (int i = 2; i <= 10; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
            counter++;
        }

    }
}
