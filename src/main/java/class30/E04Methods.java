package class30;

public class E04Methods {

    public static void main(String[] args) {

        E04Methods e04Methods = new E04Methods();
        // e04Methods.printHello();
        e04Methods.printWord("Java");

    }

    void printHello() {
        System.out.println("Hello World");
    }

    void printWord(String word) {
        System.out.println(word);
        printHello();
    }
}
