package class13;

/*
Create a string and if the string is not empty perform the following:
If the string has an odd number of characters and has 3 or more characters, print the character in the
middle of the string.
For example string str = hello => l
 */
public class Task1 {

    public static void main(String[] args) {

        // String str = new String ("Java");
        String str = "hello";

        if (!str.isBlank() && str.length() % 2 != 0 && str.length() >= 3) {
            int middleIndex = str.length() / 2;
            char middleChar = str.charAt(middleIndex);
            System.out.println(middleChar);

        }
    }


}
