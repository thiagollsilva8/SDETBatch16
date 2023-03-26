package Class4;

import java.util.Scanner;

/*
4)Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is __
the city is __”
 */
public class homeWork4 {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);
        System.out.println("What is your city?");
        String city = myscan.nextLine();
        System.out.println("What is the temperature?");
        double temperatureFarenheit = myscan.nextDouble();
        double temperatureCelsius = (temperatureFarenheit - 32) * 5/9;

        System.out.println("The temperature is "+temperatureCelsius+" , and the city is "+city);
    }
}
