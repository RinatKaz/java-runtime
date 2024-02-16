package Lesson13.Ex1Animal;

public class Dog extends Animal {
    @Override
    public void voice() {

        System.out.println("Dogs voice");
    }

    @Override
    public void name () {
        System.out.println("Кличка собаки: " + name);
    }
}
