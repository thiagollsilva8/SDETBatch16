package class19;

public class Math {

    static void add(int num1, int num2) {
        System.out.println(num1 + num2);

    }

    static void add(int num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);

    }

// We must have different
// 1. number of parameters
// 2. data types of parameters
// 3. sequence of dataTypes
    public static void main(String[] args) {
        add(10, 10);
        add(10, 20.5);
        add(2.5, 2.5);
    }

}
