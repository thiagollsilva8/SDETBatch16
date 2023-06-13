package class30;

public class E05Methods {

    public static void main(String[] args) {

        E05Methods e04Methods = new E05Methods();

        e04Methods.printWord("Java", 5);

    }

    void printWord(String word, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(word);
        }
    }
}
