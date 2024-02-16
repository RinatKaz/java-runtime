package Lesson20_Enam.Ex1;

import java.util.Scanner;

public class Main {

    static User[] users = {
            new User(9991, "John"),
            new User(9992, "Will"),
            new User(9993, "Dylan"),
            new User(9994, "Matt"),
    };

    static Product[] products = {
            new Product(1111, "Marshall IV Major", 179),
            new Product(1112, "Iphone XR", 269),
            new Product(1113, "MacBook Pro", 1219),
            new Product(1114, "Nike Air Mag", 199990),
    };

    static Order[] orders = new Order[10];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Совершите заказ");
        System.out.println("2. Посмотреть заказы");
        System.out.println("3. Изменить статус заказа");
        System.out.println("4. Завершить");
    }


//    while (true) {
//        int number = scanner.nextInt();
//        if ( == number) {
//            System.out.println("Вы угадали число!"+number);
//            break;
//        } else if (generatedNumber > number) {
//            System.out.println("Заданное число больше: "+number);
//        } else {
//            System.out.println("Заданное число меньше: "+number);
//        }
//    }

}
