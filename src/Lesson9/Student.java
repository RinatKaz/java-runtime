package Lesson9;

public class Student {
    String name;
    String history;
    Book borrowedBook;



    void display() { //метод информации
        System.out.println("Имя студента: " + name);
        if (borrowedBook != null) {
            System.out.println("Текущая книга: " + borrowedBook.title);
            System.out.println();
//            System.out.println();
        } else {
            System.out.println("Текущая книга: null");
        }
        System.out.println("История: " + history);
        System.out.println();
    }
}
