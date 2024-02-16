package Lesson13.Example2;

public class Cat extends Pet {

    public Cat() {
        super("Мяу", 4);
    }

    @Override
    void getPawsCount() {
        System.out.println("Количество лап: " + pawsCount);
    }

        void jump () {
            System.out.println("Кот прыгает");
        }
    }

