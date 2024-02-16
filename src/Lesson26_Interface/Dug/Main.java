package Lesson26_Interface.Dug;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Seagull seagull1 = new Seagull();
        duck1.swim();
        duck1.fly();
        seagull1.fly();
        seagull1.swim();
    }
}
