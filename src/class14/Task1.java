package class14;

/*
Write code that will take in a String input and check to see if it is a
palindrome or not.

Palindrome means that the characters are the same forwards and backwards, ignoring spaces examples level madam kayak
 */
public class Task1 {

    boolean isPalindrome(String str) {

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        boolean isStrPalindrome = false;
        if (str.equalsIgnoreCase(reversedStr)) {
            isStrPalindrome = true;
        }

        return isStrPalindrome;
    }



    public static void main(String[] args) {

        Task1 task1 = new Task1();
        boolean resut = task1.isPalindrome("Madam");
        System.out.println(resut);
    }

}
