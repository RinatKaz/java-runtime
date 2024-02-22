package Lesson28_Exception_Pathword.Home;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println(5 / a);
        } catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }catch (NumberFormatException e){
            System.out.println("Вы ввели не целое число");
        }
    }
}
