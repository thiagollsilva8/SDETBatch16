package class12;

public class E2StringDemo {

    public static void main(String[] args) {

        String userName = "admin";
        String password = "pass123";

        // write a code to check the username and password if the userName and
        // password are less than 8 characters this msg "Signup successful"
        // Otherwise print "UserName and password can't be more than 8 characters"

        if(userName.length() < 8 && password.length() < 8) {
            System.out.println("Signup successful");
        }else {
            System.out.println("UserName and password can't be more than 8 characters");
        }
    }
}
