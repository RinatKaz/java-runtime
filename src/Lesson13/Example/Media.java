package Lesson13.Example;

public class Media {
    String name;
    int year;

    void display(){
        System.out.println("Сериал");
        System.out.println("Название: "+name);
        System.out.println("Год выпуска: "+ year);
    }

    void test (int a){
        System.out.println("Целое число: "+a);
    }
    void test (String a){
        System.out.println("Строка: " +a);
    }

    void test (double a){
        System.out.println("Дробное число: "+a);
    }
}
