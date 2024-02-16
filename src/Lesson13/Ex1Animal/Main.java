package Lesson13.Ex1Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();


        animal.name= "Rex";
        animal.name();
        animal.voice();
                System.out.println();

        cat.name = "Barsik";
        cat.name();
        cat.voice();
        System.out.println();

        dog.name = "Дружок";
        dog.name();
        dog.voice();






    }
}
