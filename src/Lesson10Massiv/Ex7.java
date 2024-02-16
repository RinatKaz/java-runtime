package Lesson10Massiv;

import java.util.Arrays;
import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
//        int [] ellements = new int [3];
//        ellements[0]= 500;
//        ellements[1]=250;
//        ellements[2]=1000;
//        System.out.println(Arrays.toString(ellements));
//        for (int i = 0; i < ellements.length; i++) {
//            System.out.println("Сумма в день: "+ ellements[i]);
//        }
        int [] expenses = new int[7];
        Random random = new Random();
        for (int i = 0; i < expenses.length; i++) {
            expenses[i]= random.nextInt(10000);
        }
        System.out.println(Arrays.toString(expenses));

        System.out.println("Траты за неделю: ");
        for (int i = 0; i < expenses.length ; i++) {
            System.out.println("День "+(i+1)+" Потрачено: "+expenses[i]);
        }

        int sum = 0;
        for (int i = 0; i < expenses.length ; i++) {
            sum+= expenses[i];
        }
        System.out.println("Траты в тенге за неделю: "+sum);





        }
    }

