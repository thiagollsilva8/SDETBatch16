package Class12;

public class E8StringDemo {

    public static void main(String[] args) {

        String sentence = "Java is very very easy";

        // method chaining calling multiple methods on the same line
        sentence = sentence.trim().toLowerCase();
        System.out.println(sentence);


        System.out.println(sentence.startsWith("java")); // will get true as long as it starts the same way


    }
}
