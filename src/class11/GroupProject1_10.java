package class11;

/*
Write a program to print out duplicate elements from
an Array of Strings
 */

public class GroupProject1_10 {

    public static void main(String[] args) {

        String[] cars = {"BMW", "FORD", "DODGE", "FERRARI"};


        for (int i = 0; i < cars.length; i++) {

            for (int j = i + 1; j < cars.length; j++) {

                if (cars[i].equals(cars[j])) {

                }

                System.out.println(cars[j]);
            }


        }
    }
}
