package Class9;

/*
Create an array of names and store all names of your group. Then print your name from that array.
(use 2 different ways of creating an array).
 */
public class homework2Class9 {

    public static void main(String[] args) {

        String [] names = {"Mike", "Angi", "Jerold", "Bruce"};

        System.out.println(names[3]);

        System.out.println();

        String [] names1 = new String[4];
        names1[0] = "Mike";
        names1[1] = "Angi";
        names1[2] = "Jerold";
        names1[3] = "Bruce";

        System.out.println(names1[3]);

    }
}
