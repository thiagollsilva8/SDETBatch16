package class19;

/*
Create 3 classes like Dog Cat Horse define 5 properties(use default access level).
You can use inheritance to avoid code duplication.
Create one printInfo method that will print the values of these variables.
create constructors as well in each child class to initialize those properties
create one object of each class and call the printInfo method
 */
public class Animal {

    String name;
    String color;
    String breed;
    int age;
    double weight;

    public Animal(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age + " " + weight);
    }
}
    class Dog extends Animal {
        double price;

        public Dog(String name, String color, String breed, int age, double weight, double price) {
            super(name, color, breed, age, weight);
            this.price = price;
        }
        void printInfo() {
            super.printInfo();
            System.out.println(price);
        }
    }

    class Cat extends Animal {

        public Cat(String name, String color, String breed, int age, double weight) {
            super(name, color, breed, age, weight);
        }

    }

    class Horse extends Animal {
        public Horse(String name, String color, String breed, int age, double weight) {
            super(name, color, breed, age, weight);
        }

    }

    class AnimalTester {
        public static void main(String[] args) {


            Dog dog = new Dog("Jack", "Black", "Persian", 10, 20, 200);
            dog.printInfo();
        }

    }