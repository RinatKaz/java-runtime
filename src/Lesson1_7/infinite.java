package Lesson1_7;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class infinite {
    public static void main(String[] args) {
        int min = 1;
        int max = 7;
        System.out.print("Введите число от "+min+ " до "+max+ " : " );
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int generatedNumber = random.nextInt(max - min) + min;

        while (true) {
            int number = scanner.nextInt();
            if (generatedNumber == number) {
                System.out.println("Вы угадали число!"+number);
                break;
            } else if (generatedNumber > number) {
                System.out.println("Заданное число больше: "+number);
            } else {
                System.out.println("Заданное число меньше: "+number);
            }
        }


//
//        while (true){
//            String number = scanner.nextLine();
//
//            if (number.equals("admin")){
//                System.out.println("Доступ разрешен");
//                break;
//            } else {
//                System.out.println("Неправильный пароль, попробуйте еще раз.");


    }
}
