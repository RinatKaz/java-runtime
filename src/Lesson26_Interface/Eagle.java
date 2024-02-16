package Lesson26_Interface;

public class Eagle extends BirdOfPrey implements Flyable{

    String name;

    public Eagle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void soarHigh() {
        System.out.println(name+" высоко парит");

    }

    @Override
    public void makeSound() {
        System.out.println(name+ " издает звук");

    }

    @Override
    public void huntSmallAnimals() {
        System.out.println(name+" охотится на мелких животных");

    }
}
