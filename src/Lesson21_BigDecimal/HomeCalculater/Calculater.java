package Lesson21_BigDecimal.HomeCalculater;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {

        String str = "57";
        System.out.println(Integer.parseInt(str) + 100);

        Integer x = 14;
        printNumber(x);


        byte a = 10;
        byte b =20;
        System.out.println(findMax(a,b));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        BigDecimal c = new BigDecimal(scanner.nextInt());
        System.out.print("Введите второе число: ");
        BigDecimal d = new BigDecimal(scanner.nextInt());





        System.out.println("Сложение "+c+ " + "+d+" = "+ c.add(d));
        System.out.println("Вычитание "+c+ " - "+d+" = "+ c.subtract(d));
        System.out.println("Вычитание "+c+ " * "+d+" = "+ c.multiply(d));
        System.out.println("Вычитание "+c+ " / "+d+" = "+ c.divide(d));

    }

    private static int findMax1 (int firstNumber1, int secondNumber1) {
        return Integer.max(firstNumber1, secondNumber1);
    }
    private static int findMin1 (int firstNumber1, int secondNumber1) {
        return Integer.min(firstNumber1, secondNumber1);
    }

    private static byte findMax (byte firstNumber, byte secondNumber){
        return (byte)Integer.max(firstNumber,secondNumber);
    }

    public static void printNumber(int i) {
        System.out.println("Вы ввели число " + i);
    }
}








