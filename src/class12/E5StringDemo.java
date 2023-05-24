package class12;

public class E5StringDemo {

    public static void main(String[] args) {

        String name = "    ";
        System.out.println(name.isEmpty()); // will return true if its empty without spaces
        System.out.println(name.isBlank()); // will return true is empty with empty spaces

    }
}
