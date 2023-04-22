package Class10;

/*
Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops
 */
public class Class10Homework3 {

    public static void main(String[] args) {

                String[][] food = {
                        {"Carrots", "Lettuce", "Tomatoes"},
                        {"Bananas", "strawberry", "Passion Fruit"},
                        {"Milk", "Cheese", "Butter"},
                        {"Ice cream", "Chocolate", "Candy"}
                };

        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j]);
            }
        }
        System.out.println();

        for (String[] strings : food) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }

}
