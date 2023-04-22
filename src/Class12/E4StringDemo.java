package Class12;

public class E4StringDemo {

    public static void main(String[] args) {

        String firstName = "Thiago";
        String lastName = "Silva";

        String fullName = firstName+" "+lastName; // Most widely used approach
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));
    }
}
