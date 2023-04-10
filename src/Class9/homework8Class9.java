package Class9;

/*
Create an array to store char values and then print those in reverse order
 */
public class homework8Class9 {

    public static void main(String[] args) {

        char[] values = {'A', 'B', 'C', 'D', 'E', 'f' };

        for (int i = values.length - 1; i >= 0 ; i--) {
            System.out.print(values[i]+" ");
        }
    }
}
