package class09;

public class E5Arrays {

    public static void main(String[] args) {

        /*
        write a loop that starts from 0 and it goes till the number 5 and print
        only
         */


        char[] chars = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < chars.length; i += 2) {
            System.out.println(chars[i]);
        }
    }
}
