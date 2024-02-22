package Lesson28_Exception_Pathword.Home;

public class Ex2_method {
    public static void main(String[] args) {
        System.out.println("Начало программы");
        try {
            System.out.println("Перед вызовом method1");
            method1();
            System.out.println("После вызова метода method1. Эта страка никогда не будет показана");
        } catch (Exception e) {
            System.out.println("Исключение было поймано");
        }
        System.out.println("Программа все еще работает");
    }
    public static void method1(){
        int a =5;
        int b =0;
        System.out.println((a/b));
    }
}
