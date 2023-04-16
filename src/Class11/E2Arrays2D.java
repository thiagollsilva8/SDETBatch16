package Class11;

public class E2Arrays2D {

    public static void main(String[] args) {

        String[][]names = {{"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Vlad", "Alina"}
        };

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }
    }
}
