package Lesson36_binarniiPoisk.Home_2;

import java.util.HashSet;
import java.util.Scanner;

public class MainForNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (true) {
            String number = scanner.nextLine();
            int count;//количество символов
            count = number.length();
            int x = 1;

            for (int i = 0; i <= Math.ceil(number.toCharArray().length / 2); i++) {
                if (number.charAt(i) == number.charAt(count - (i + 1))) {
                    x = 1;
                } else {
                    x = 2;
                    break;
                }
            }
            if (x == 1) {
                System.out.println("число подходит");
            } else {
                System.out.println("число не подходит");
            }
            System.out.println();
            System.out.println("Введите число: ");
        }

    }
}
