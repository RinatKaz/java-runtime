package Lesson13.Car;

public class ServiceStation {
    void repair(ElectricCar car) {
        System.out.println("Починили электромобиль");
    }

    void repair(HybridCar car) {
        System.out.println("Починили гибридный автромобиль");
    }

    void repair(Car car) {
        System.out.println("Починили автомобиль");
    }
}