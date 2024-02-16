package Lesson13.Ex1Animal;

public class Cat extends Animal {
    @Override
    public void voice() {

        System.out.println("Cats voice");
    }
    @Override
    public void name () {
        System.out.println("Кличка кошки: " + name);
    }

}
