package Lesson26_Interface;

public class Swam extends Animal implements Flyable, Swimable{


    @Override
    public void makeSound() {

    }

    @Override
    public void soarHigh() {


    }

    @Override
    public void startSwimming() {
        System.out.println("Начинает плавать");

    }

    @Override
    public void stopSwimming() {
        System.out.println("Прекращает плавать");

    }

    void gracefulSwim() {
        System.out.println("Изящно плавает");

    }
}
