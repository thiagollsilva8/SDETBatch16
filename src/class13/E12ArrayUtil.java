package class13;

public class E12ArrayUtil {

    public static void main(String[] args) {

        // Write the logic to search if the number is present in the array or not
        int[] arr = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889};
        int[] arr2 = {120, 302, 5, 889};

        int number = 100;
        int number1 = 10;
        int number2 = 10;

      E12ArrayUtil thiago = new E12ArrayUtil();
      thiago.searchArray(arr, number);
      thiago.searchArray(arr1, number1);
      thiago.searchArray(arr2, number2);

        }


        void searchArray(int[] arr, int number) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                    System.out.println("Yes");
                    break;
                }
            }
        }
    }
