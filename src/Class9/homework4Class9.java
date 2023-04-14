package Class9;

/*
Create an array of cars and store 6 elements into it.
Using 2 different loops print all values from the array.
 */
public class homework4Class9 {

    public static void main(String[] args) {

        String [] cars = {"BMW", "Mercedes", "Acura", "Lexus", "Cadillac", "Tesla"};

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");
        }
        System.out.println();

        for (String car : cars) {
            System.out.print(car+" ");
        }
    }
}
