package class14;

public class E7 {

    void printLarger (int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        // easier way to write the syntax above => System.out.println(Math.max(a, b));
    }

    public static void main(String[] args) {


        E7 e7 = new E7();
        e7.printLarger(10, 30);


    }

}
