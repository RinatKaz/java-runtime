package Lesson13.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        car.brand="BMW";
        car.maxSpeed=280;
        car.display();

        electricCar.brand="Tesla";
        electricCar.maxSpeed=400;
        electricCar.battery=2800;
        electricCar.display();

        ServiceStation serviceStation = new ServiceStation();

        serviceStation.repair(electricCar);


    }
}
