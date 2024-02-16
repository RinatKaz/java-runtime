package Lesson1_7;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class For_While {
    public static void main(String[] args) {

//        int day =0;
//            for (int money = 2500-500 ; money>=0;money-=500 ){
//                day+=3;
//            System.out.println("На "+ day+"-й день останется "+money+" тенге");
//        }
//        System.out.println("Денег хватит на "+day+ " дней");

//        int hour = 0;
//        for (int i = 10000-500; i >=0 ; i-=500) {
//            hour+=1;
//            System.out.println("После "+hour+" часов работы останется "+i + " мАч");
//        }
//        System.out.println("Батареи хватит на "+ hour+ " часов работы");


//        int day = 0;
//        for (int i = 5000-250; i >=0 ; i-=250) {
//            day+=1;
//            System.out.println("На "+day+ "-й день останется "+i+ " литров воды");
//        }
//        System.out.println("Воды хватит на "+day+ " дней");


//        for (int i = 1; i < 21; i++){
//            if ( (i % 3==0) && (i%5==0)){
//                System.out.println("Hello.Runtime");
//            }else if (i % 3==0){
//                System.out.println("Hello");
//            }
//            else if (i%5==0 ){
//                System.out.println("Runtime");
//            } else {
//                System.out.println(i);


//        double deposit =25000;
//        int percent = 4;
//        int months= 0;
//        int target = 205000;
//        for (deposit = 25000; months < 36; deposit+=5000) {
//            months++;
//            deposit= deposit+(deposit*0.0033333);
//            System.out.println("Сумма в "+ months+ " месяц = "+deposit);
//            }
//        if (deposit>=target){
//            System.out.println("Через "+months+ " накопится "+deposit+ " тенге");
//            System.out.println("Ура! Можно идти в магазин за новым объективом");
//        }else {
//            System.out.println("Нужно копить еще!");
//        }
//        int days = 30;
//        int serii = 3;
//        for (int i = 1; i <= days; i++) {
//            System.out.println("День "+ i);
//            for (int j = 1; j <=serii ; j++) {
//                System.out.println("Серия "+j);
//
//            }
//
//        }

//        int floor = 10; / недописан код. ошибка
//        int apartment = 50;
//        int count=1;
//        for (int i = 1; i <= floor ; i++) {
//            for (int j = 1; j <=apartment ; j++) {
//                count++;
//                System.out.println("Этаж "+ i+ " квартира "+ j+ "- доставлено");

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите столицу страны Австралия: ");
//        String i = scanner.next();
//
//        System.out.println("Ваш ответ: "+ i);
//        System.out.println("Правильный ответ: Канбера");


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число А: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите число Б: ");
//        int b = scanner.nextInt();
//        System.out.println("Сумма чисел "+a + " и "+  b+" = "+ (a+b));

//        int i = 5;
//        while (i< 10){
//            System.out.println(i);
//            i++;
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число А: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите число Б: ");
//        int b = scanner.nextInt();
//        System.out.print("Введите число Б: ");
//        int c = scanner.nextInt();
//        if (a<b && a< b) {
//            System.out.println(a+ " меньшее число");
//        }else if (b<a && b<c){
//            System.out.println(b+ " меньшее число");
//        }else if (c<a && c<b){
//            System.out.println(c+ " меньшее число");
//        }else {
//            System.out.println("Есть равные числа");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество фильмов: ");
//        int a = scanner.nextInt();
//        double storage = 0;
//
//        for (int i =1; i<= a; i++){
//            System.out.println("Введите продолжительность фильма в минутах: ");
//            int b = scanner.nextInt();
//            storage= storage+b;
//        }
//        double hours = storage/60;
//        System.out.println("Общая продолжительность фильмов: "+hours+ " часов");

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество ступенек: ");
//        int a = scanner.nextInt();
//        String b = "#";
//        String c ="#";
//        for (int i = 0; i < a ; i++) {
//            System.out.println(b);
//            b=b+c;
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите общий бюджет: ");
//        int a = scanner.nextInt(); // a- общий выделенный бюджет
//        System.out.print("Введите колиечество проектов: ");
//        int b = scanner.nextInt();// b- количество проектов
//
//        for (int i = 1; i <=b ; i++) {
//            System.out.print("Введите бюджет проекта №"+i+": ");
//            int c = scanner.nextInt(); // c- бюджет проекта
//            if (c<a){
//                System.out.println("Проект №"+i+" получил финансирование в размере: "+c);
//                a=a-c;
//                System.out.println("Бюджет: "+ a);
//                System.out.println();
//            }else {
//                System.out.println("Бюджет закончился. Проект "+i+ " не получает финансирование.");
//                break;
//            }
//        }






    }
}
