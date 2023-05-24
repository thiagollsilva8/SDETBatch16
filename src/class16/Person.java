package class16;

public class Person {

    String SSN = "123456789";

    private String password;

    private static double bankBalance = 12000;

    private void printPassword() {
        System.out.println(password);
    }

    private static void printBalance() {
    System.out.println(bankBalance);
}

    public static void main(String[] args) {

        Person Thiago = new Person();
        Thiago.password = "12345";
        Thiago.printPassword();
        System.out.println(Person.bankBalance);
        System.out.println(Thiago.SSN);

    }
}
