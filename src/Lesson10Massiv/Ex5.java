package Lesson10Massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
//        String[] currency = {"USD","EUR","RUB","KZT","JPY"};
//        System.out.println(currency);
//        System.out.println(Arrays.toString(currency));
//        System.out.println(Arrays.toString(currency));
//        System.out.println(currency[1]);
//        currency[1] = "GBP";
//        System.out.println(Arrays.toString(currency));
        double[] expenses = {1500.50 ,2500.50 , 500.00 , 0.0 , 4750.60, 2500.20, 1200.00};
        System.out.println("Весь массив: "+Arrays.toString(expenses));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс дня, который хотите отредактировать: ");
        int index = scanner.nextInt();
        System.out.println("Введите сумму: ");
        int number = scanner.nextInt();
        expenses[index] = number;
        System.out.println("Весь массив: "+Arrays.toString(expenses));
        String [] currencies = new String[5];
        System.out.println(Arrays.toString(currencies));
        System.out.println(currencies.length);

//        double sum = expenses[1]+ expenses[4]+expenses[5];
//        System.out.println("сумма трех лучших дней: "+ sum);

    }
}
