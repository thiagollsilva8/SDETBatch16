package class20;

public class Animal {

    String name;
    String color;
    int age;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void sleep() {
        System.out.println("ZzzzZZZZzz");
    }

    void eat() {
        System.out.println("eat");
    }

    void speak() {
        System.out.println("Speaking");
    }

}

class Dog2 extends Animal {

    Dog2(String name, String color, int age) {
        super(name, color, age);
    }

    void sleep() {
        System.out.println("I like to sleep for 10.6 hours a day");
    }

}

class Cat2 extends Animal {
    Cat2(String name, String color, int age) {
        super(name, color, age);
    }

}

class Horse2 extends Animal {
    Horse2(String name, String color, int age) {
        super(name, color, age);
    }

}