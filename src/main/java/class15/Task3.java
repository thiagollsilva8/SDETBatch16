package class15;

/*
WRITE A METHOD TO RETURN WHETHER A GIVEN NUMBER IS PRIME OR NOT
 */
public class Task3 {

    boolean isPrime(int num) {
        boolean isPrimeNum = true;
        int count = 0;

        for (int i = 2; i <= num ; i++) {
            if (num % i == 0) {
                count++;
                break;
            }

            if (count > 1) {
                isPrimeNum = false;
            }


        }

        return isPrimeNum;


    }




}
