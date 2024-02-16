package Lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car [] cars = new Car[4];

        Car car1 = new Car();
        car1.brand = "BMW";
        car1.model= "X5";
        car1.release= 1999;
        cars[0]=car1;

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model= "A6";
        car2.release= 1994;
        cars[1]=car2;

        Car car3 = new Car();
        car3.brand = "Volkswagen";
        car3.model= "Golf";
        car3.release= 1297;
        cars[2]=car3;

        Car car4 = new Car();
        car4.brand = "Toyota";
        car4.model= "Camry";
        car4.release= 1982;
        cars[3]=car4;

//        System.out.println(Arrays.toString(cars));
//        System.out.println(cars[0].brand+ " "+ cars[0].model+ " "+ cars[0].release);
//        System.out.println(cars[1].brand+ " "+ cars[1].model+ " "+ cars[1].release);
//        System.out.println(cars[2].brand+ " "+ cars[2].model+ " "+ cars[2].release);
//        System.out.println(cars[3].brand+ " "+ cars[3].model+ " "+ cars[3].release);
        for (Car car : cars) {
            System.out.println(car.brand+" "+ car.release+ " "+ car.release);

        }


    }
}
