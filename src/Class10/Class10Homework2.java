package Class10;

/*
Create 2D array of cars : american, german, korean, italian.
Then retrieve all values from that array using 2 different loops
 */
public class Class10Homework2 {

    public static void main(String[] args) {

        String[][] cars = {
                {"American", "German", "Korean", "Italian"},
                {"Dodge", "Mercedes", "Hyundai", "Ferrari"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }
        System.out.println();

        for (String[] car : cars) {
            for (String s : car) {
                System.out.println(s);
            }
        }
    }
}
