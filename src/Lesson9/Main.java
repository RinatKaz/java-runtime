package Lesson9;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();// создается объект Библиотека из класса Библиотека

        Book book = new Book(); // создается объект Книга из класса Книга
        book.title = "1984";
        book.author = "George Orwell";
        library.availableBook = book;// из класса Библиотека доступность = книга

        Student student =new Student();//создается объект студент из класса Студент
        student.name= "Вася";// объекту студент присваиваем имя Вася
        student.display();//объект студент вызывает метод Дисплей

        library.lendBook(student, 7);//объект Библиотека вызывает метод одалживания книги (студенту)
        student.display();//объект студент вызывает метод дисплей

        library.acceptBook(student);//объект Библиотека метод принятия книги (студентом)
        student.display();//объект студент вызывает метод дисплей
    }
}
