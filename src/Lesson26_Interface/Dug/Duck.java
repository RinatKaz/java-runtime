package Lesson26_Interface.Dug;

public class Duck implements Flyable,Waterfowl {
    @Override
    public void fly() {
        System.out.printf("Лечу над камышами ");
    }

    @Override
    public void land() {

    }

    @Override
    public void swim() {
        System.out.printf("Плаваю в пруду ");
    }
}
