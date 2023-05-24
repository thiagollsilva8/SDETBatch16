package class20;

public class Dog {

    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public void bark() {
        System.out.println("woof woof");
    }

    public void wagTail() {
        System.out.println("waggy waggy");
    }

    public void fetchBall() {
        System.out.println("Fetch");
    }

    public void eat(String food) {
        System.out.println("eats");
    }

    public void slee() {
        System.out.println("nap time");
    }
}

class Cat {
    private String name;
    private int age;
    private String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void meow() {
        System.out.println("meow");
    }

    public void scratch() {
        System.out.println("scratch");
    }

    public void play() {
        System.out.println("play");
    }

    public void eat(String food) {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("ZZZZZZzzzzz");
    }
}

class Horse {

    private String name;
    private int age;
    private String breed;

    public Horse(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public void neigh() {
        System.out.println("neigh");
    }

    public void gallop() {
        System.out.println("gallop");
    }

    public void play() {
        System.out.println("play");
    }

    public void eat(String food) {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("ZZZZZZzzzzz");
    }
}

