package class08;

public class E10NestedLoop5 {

    public static void main(String[] args) {

        /* Task - print this pattern:
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
         */

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
