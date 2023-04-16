package Class11;

public class E3Arrays2D {

    public static void main(String[] args) {

        String[][] names2DArray = {{"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Vlad", "Alina"}
        };

        for (String[] name1DArr : names2DArray) {
            for (String name : name1DArr) {
                System.out.println(name);
            }
        }
    }
}