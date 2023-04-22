package Class12;

public class E10StringDemo {

    public static void main(String[] args) {

        String name = "THIAGOH";

        // System.out.println(name.charAt(1));
        // Count how many times the letter H has appeared

        int counter = 0;

        for (int i = 0; i < name.length(); i++) {


            if (name.charAt(i) == 'H') {
                counter++;
            }
        }
        System.out.print(counter);
    }
}
