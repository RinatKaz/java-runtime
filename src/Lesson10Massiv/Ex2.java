package Lesson10Massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {


        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};


        Scanner scanner = new Scanner(System.in);

        System.out.println("Расходы за неделю хранятся под индексами от 0 (пн) до 6 (вс).");
        System.out.println("Введите индекс дня, траты за который вы хотите отредактировать:");

        // Объявите переменную, которая будет хранить индекс выбранного элемента
        int index = scanner.nextInt();

        System.out.println("Введите новую сумму трат за этот день:");
        // Объявите переменную, в которой будет сохранено новое значение трат за выбранный день
        double newExpense = scanner.nextDouble();

// Замените значение элемента с нужным индексом на новое
        System.out.println("За день с индексом " + index +" размер трат теперь " +newExpense);
        expenses[index]=newExpense;
        System.out.println(Arrays.toString(expenses));
    }
}
