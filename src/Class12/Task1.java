package Class12;

public class Task1 {

    public static void main(String[] args) {

        String userName = "admin";
        String password = "pass123@";
        String confirmedPassword = "pass123@";

        if (userName.isEmpty() && password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(userName)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmedPassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }
    }
}
