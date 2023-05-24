package class20;

public class AnimalClassesExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Willy", 2, "Poodle");
        Cat cat = new Cat("Kitty", 4, "white");
        Horse horse = new Horse("Ray", 2, "Campolina");

        dog.bark();
        dog.fetchBall();
        cat.meow();
        cat.play();
        horse.neigh();
        horse.gallop();
    }
}
