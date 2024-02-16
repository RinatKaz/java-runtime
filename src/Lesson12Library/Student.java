package Lesson12Library;

public class Student {
    String name;
    String history = "";
    Book borrowedBook;

    int rentedDays;

    void display() {
        System.out.println("Имя студента: " + name);
        if (borrowedBook != null) {
            System.out.println("Текущая книга: " + borrowedBook.title);
        } else {
            System.out.println("Текущая книга: null");
        }
        System.out.println("История: " + history);
        System.out.println();
    }
}