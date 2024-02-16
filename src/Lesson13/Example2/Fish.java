package Lesson13.Example2;

public class Fish extends Pet{
    public Fish (){
        super("Буль-буль", 8);
    }

    @Override
    void getPawsCount() {
        System.out.println("Количество лап: " + pawsCount);
    }
}
