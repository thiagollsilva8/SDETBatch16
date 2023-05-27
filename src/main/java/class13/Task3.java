package class13;

/*
Create a string that should be a combination of letters, numbers and special characters.
Find out how many alphabet letters(abd AZ) characters are there in the String.
 */
public class Task3 {

    public static void main(String[] args) {

        String str = "asfasdfAFADSFDGE1234124!@#!#$@!%";
String str1 = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
