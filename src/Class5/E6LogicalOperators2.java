package Class5;

public class E6LogicalOperators2 {

    public static void main(String[] args) {

        //  System.out.println(true ||true||false);

        int age = 17;

        if (age < 18 || age > 60) {
            System.out.println("You will get a discount");
        }

        // if gender is F or age >60 you will get a discount

        char gender = 'F';

        String name = "Mary";

        if (gender == 'F' || age > 60) {
            System.out.println("You will get a discount");
        }

    }
}
