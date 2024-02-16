package Lesson12Library;

public class Book {
    String title;
    String author;
    String status;
    int rentedDays;

    void defineStatus(){
        if (rentedDays < 100) {
            status = "NEW";
        } else if (rentedDays < 500) {
            status = "USED";
        } else {
            status = "OLD";
        }
    }

    void display(){
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Состояние книги: " + rentedDays);
    }
}
