package Lesson13.Car;

public class HybridCar extends Car {

    @Override
    public void display() {
        System.out.println("Бренд эл.машины: " + brand);
        System.out.println("Максимальная скорость: "+maxSpeed);

    }
}
