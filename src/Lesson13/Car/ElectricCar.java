package Lesson13.Car;

import Lesson13.Ex.Cat;

public class ElectricCar extends Car {
    int battery;

    @Override
    public void display() {
        System.out.println("Бренд эл.машины: " + brand);
        System.out.println("Максимальная скорость: "+maxSpeed);
        System.out.println("Емкость батареи: "+battery);
    }
}
