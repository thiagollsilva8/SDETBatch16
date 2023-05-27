package class13;

public class E11Math {

    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void main(String[] args) {

        // Creating the object of E11Math class calling it math
        E11Math math = new E11Math();
        // calling the method add and passing two values
        math.add(10, 10);
        math.multiply(5, 5);

    }
}
