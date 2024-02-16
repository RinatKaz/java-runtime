package Lesson13.Example2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Лап-"+cat.pawsCount+"  Звук -"+ cat.voice);
        cat.getPawsCount();

        Fish fish = new Fish();
        System.out.println("Лап -"+fish.pawsCount+ " Звук -"+fish.voice);
        fish.getPawsCount();
    }
}
