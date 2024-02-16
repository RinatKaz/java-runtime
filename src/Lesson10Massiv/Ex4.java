package Lesson10Massiv;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        int[] expenses = new int[7];
        Random random = new Random();
        System.out.println("Траты за неделю: ");
        int count =0 ;

        for (int i = 0; i <expenses.length ; i++) {
            expenses[i]= random.nextInt(10000);
            count= count+expenses[i];
            System.out.println("День "+(i+1)+ ". Потрачено тенге: "+ expenses[i]);
        }
        System.out.println("Траты в тенге за неделю "+count);
        System.out.println(Arrays.toString(expenses));

    }
}
