package class13;

/*
You have a String a = "Is it Saturday? Is it raining? Do we have a Java class today?"
How would you find out how many sentences are in that String?
 */
public class Task4 {

    public static void main(String[] args) {

        String str = "Is it Saturday? Is it raining? Do we have a Java class today?";
        String[] strArr = str.split("[.!?]");
        System.out.println(strArr.length);


    }
}
