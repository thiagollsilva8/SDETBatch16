package Class9;

/*
Create an array of animals and store 5 elements into it.
Using 2 different loops print all elements from the array.
 */
public class homework5Class9 {

    public static void main(String[] args) {

        String[] animals = {"Lion", "Elephant", "Giraffe", "Monkey", "Eagle"};

        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]+" ");
        }
        System.out.println();

        for (String animal : animals) {
            System.out.print(animal+" ");
        }
    }
}
