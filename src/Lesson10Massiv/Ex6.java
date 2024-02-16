package Lesson10Massiv;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        String [] currencies = {"USD", "EUR", "JPY", "RUB", "KZT"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Покупка йен недоступна. Выберите другую валюту.");


        int index = scanner.nextInt();
        String userCurrency = scanner.next();
        currencies[index] = userCurrency;
        System.out.println("Спасибо! Эта валюта в наличии.");
        System.out.println("Мы заменили в вашем портфеле JPY на "+ currencies[2]);





    }
}
