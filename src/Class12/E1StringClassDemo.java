package Class12;

public class E1StringClassDemo {

    public static void main(String[] args) {

        // create the object of that class
        // this is an example of how a String class is created, and it is similar
        // to the creation of a Scanner class: Scanner scan = new Scanner(System.in);
        // also: ClassName objectName = new Classname();
        // String s = new String("Thiago");

        String s1 = "Thiago"; //Most widely used concept
        System.out.println(s1.length()); // There are 6 letters in Thiago

        String name = "Justin Chukwudiuche";

        if(name.length() > 8) {
            System.out.println("Only 8 characters are allowed");
        }


    }
}
