package Lesson26_Interface.Dug;

public class Seagull implements Flyable,Hunter,Waterfowl {
    @Override
    public void fly() {
        System.out.printf("Парю над морем ");
    }

    @Override
    public void land() {

    }

    @Override
    public void hunt() {
        System.out.printf("Ловлю рыбу ");
    }

    @Override
    public void swim() {
        System.out.printf("Качаюсь на волнах ");
    }
}
