package class06;

public class E1LogicalOperators {

    public static void main(String[] args) {

        boolean chocolates = true;
        boolean flowers = false;
        if (chocolates || flowers) {
            System.out.println("I am happy");
        } else {
            System.out.println("I am sad");
        }

        boolean fiveG = false;
        boolean wifi = false;

        if (wifi || fiveG) {
            System.out.println("You can browse the internet");
        } else {
            System.out.println("Not connected to the internet");
        }

    }
}
