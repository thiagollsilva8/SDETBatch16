package class20;

public class Parent {

    void getMarried() {
        System.out.println("Married to the girl of our choice");
    }

    private void accessBank() {
        System.out.println("Accessing bank");
    }

    static void printNumber() {
        System.out.println(10);
    }
}

class Axel extends Parent {

    static void printNumber() {
        System.out.println(20);
    }
    @Override
    void getMarried() {
        System.out.println("He will marry some chick and he wants 10 kids");
    }

}

class ParentTester {

    public static void main(String[] args) {

        Axel axel = new Axel();
        axel.getMarried();
        axel.printNumber();
    }
}