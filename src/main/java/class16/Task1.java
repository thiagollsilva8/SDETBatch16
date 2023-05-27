package class16;

/*
Create a method that will accept an array as parameters and will return  a sum of all elements from that array.
Method should be visibly only within same package and accessible by the creating an instance of the class.
 */
public class Task1 {

    int sumArray(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        return sum;

    }

    public static void main(String[] args) {

        Task1 obj= new Task1();
        int sum = obj.sumArray(new int[] {19, 2, 14, 9});
        System.out.println(sum);

    }

}
