package class20;

public class AnimalTester {

    public static void main(String[] args) {

        Dog2 dog2 = new Dog2("Saddam", "brown", 6);
        Cat2 cat2 = new Cat2("Tom", "White", 8);
        Horse2 horse2 = new Horse2("Thunder", "brown", 4);

        dog2.eat();
        dog2.sleep();
        dog2.speak();

        System.out.println();

        cat2.eat();
        cat2.sleep();
        cat2.speak();

        System.out.println();

        horse2.eat();
        horse2.sleep();
        horse2.speak();


    }
}
