package class10;

/*
Create 2D array of countries: north america countries, south america countries,
europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */
public class Class10Homework6 {

    public static void main(String[] args) {

        String [][] countries = {
                {"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Uruguay"},
                {"Portugal", "Spain", "Italy"},
                {"South Korea", "Japan", "Taiwan"},
                {"Angola", "Marroco", "Ghana"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
            }
        }

        System.out.println();

        int totalCountries = 0;
        for (String[] country : countries) {
            for (String nations : country) {
                System.out.println(nations+" ");
                totalCountries++;

            }


        }
        System.out.println();

        System.out.println(totalCountries);

    }
}
