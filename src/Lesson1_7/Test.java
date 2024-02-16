package Lesson1_7;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
//        System.out.println("Тренировка началась");
//        for (int orbit =1 ; orbit <=5; orbit ++){
//            System.out.println("Круг " +orbit);
//        }
//        System.out.println("Тренировка закончилась");



        System.out.println("Это первый этаж дома, который построил Джек");
        for (int i =1 ; i <=9; i ++) {
            System.out.println("А это " + (i+1) + " этаж, он на один выше, чем этаж " + i);
        }
        System.out.println("____________________________________________");
        for (int i =70 ; i >=0; i-=7) {
            System.out.println("До старта SpaceY осталось  " + i);
        }
        System.out.println("Поехали! Узнаем, есть ли жизнь на Марсе!");

        System.out.println("________________________________________");
        int days = 1  ;
        int moneyPerDay = 200 ;
        int sum = 0;

        for ( days=1; days<=5; days++ ) {
            System.out.println("День "+ days+ ". Уже "+ moneyPerDay+ " тенге");
            moneyPerDay+=200;
        }





        System.out.println("_______________");
        System.out.println("Тренировка началась");
        int orbit1 = 1;
        while (orbit1 <=5) {
            System.out.println("Круг "+orbit1);
            orbit1++;
        }
        System.out.println("Тренировка закончилась");



    }
}

