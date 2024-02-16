package Home7lessons;

import java.util.Random;

public class MethodManager {
    void printRandomNumbers(int count, int min, int max) {


        for (int i = 1; i < count; i++) {
            Random random = new Random();
            int a = random.nextInt(min, max);
            System.out.println(a);

        }

    }

    void printPrimeNumbers(int number) {
        for (int i = 2; i < number; i++) {

            if (i % 2 == 0 && i != 2 || i == 1 || i % 3 == 0 && i != 3 || i % 5 == 0 && i != 5 || i % 7 == 0 && i != 7 || i % 9 == 0 && i != 9) {

            } else {
                System.out.println(i);
            }
        }
    }


    void calculatePriceWithVAT(double price, double vatRate) {
        double i = price + (price * vatRate / 100);
        System.out.println("Цена товара без НДС: " + price);
        System.out.println("Цена товара с учетом НДС: " + i);
    }

    void calculateChange(double itemPrice, double moneyGiven) {
        double i = moneyGiven - itemPrice;
        System.out.println("Цена товара: " + itemPrice);
        System.out.println("Покупатель дал: " + moneyGiven);
        System.out.println("Сумма сдачи: " + i);
    }




    double orderCost(String dishType, int quantity) {

        switch (dishType) {
            case "Суп":
                return 3000 * quantity;
            case "Главное блюдо":
                return 5000 * quantity;
            case "Десерт":
                return 2000 * quantity;
            default:
                return -1;
        }
    }
}










