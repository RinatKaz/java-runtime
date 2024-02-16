package Lesson26_Interface;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Орел");
        Swam swam = new Swam();
        eagle.huntSmallAnimals();
        eagle.soarHigh();
        eagle.huntSmallAnimals();
        swam.startSwimming();
    }
}
