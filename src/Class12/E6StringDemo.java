package Class12;


public class E6StringDemo {

    public static void main(String[] args) {

        String name = "Thiago";

        System.out.println(name.equals("David"));
        System.out.println(name.equals("Thiago"));
        System.out.println(name.equalsIgnoreCase("THIAGO"));
        System.out.println(!name.equalsIgnoreCase("THIAGO"));

    }
}
