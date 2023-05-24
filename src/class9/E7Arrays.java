package class9;

public class E7Arrays {

    public static void main(String[] args) {

        boolean[] flags = {true, false, true, false, false, true};
        // write a loop to count how many values in above array are false

        int sum = 0;

        for (int i = 0; i < flags.length; i++) {
            if (flags[i] == false) {
                sum++;
            }
        }
        System.out.println(sum);


        System.out.println("------------------OR--------------------");

        for (int i = 0; i < flags.length; i++) {
            if (flags[i] == false) {
                System.out.println(flags[i]);
            }
        }


    }
}