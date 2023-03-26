package Class4;

import java.util.Scanner;

/*
3)You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, otherwise you
will offer them to get a learners permit.
 */
public class homeWork3 {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = myscan.nextInt();

        if(age >= 18){
            System.out.println("Driver's license issued");
        }else{
            System.out.println("Do you want a Learner's permit?");
        }
    }
}
