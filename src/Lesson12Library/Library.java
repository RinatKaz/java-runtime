package Lesson12Library;

import java.util.Random;

public class Library {
    Book[] books;

    int maxRentalDays = 5;
    int penaltyPerDay = 5000;

    void lendBook(Student student, String bookName, int days) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].title.equals(bookName)) {
                student.borrowedBook = books[i];
                books[i].rentedDays += days;
                student.rentedDays = days;
                books[i].defineStatus();
                books[i] = null;
                return;
            }
        }
        System.out.println("Книга не найдена");
    }


    void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }
    void displayBooks (){
        for (int i = 0; i < books.length; i++) {
            if (books[i]!=null) {
                System.out.println(books[i].title);

            }
        }
    }
    // TODO: распечатает названия всех книг
    // EXPECTED:
    // - bookName
    // - bookName
    // - bookName




    int getActualSize() {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                count += 1;
            }
        }
        return count;
    }
    // TODO: возвращать количество книг


    // TODO: возвращать массив индексов пустых мест массива books


    int[] getFreeSpaces() {
        int countSpace= 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i]==null){
                countSpace+=1;
            }
        }
        int [] index= new int[countSpace];
        int a=0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                index[a] +=i;
                a+=1;
            }
        }
        return index;
    }



    // TODO: возвращать случайную книгу из массива (not null)
    Book getRandomBook() {
        Random random = new Random();
        int randomIndex = random.nextInt(books.length);
        Book book = books[randomIndex];
        if (book == null) {
            randomIndex = random.nextInt(books.length);
            book = books[randomIndex];
        }
        return book;
    }



    void acceptBook(Student student) {
        if (student.borrowedBook == null) {
            System.out.println("У студента нет книги");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i] = student.borrowedBook;
                student.history += books[i].title + " ";
                student.borrowedBook = null;
                if (student.rentedDays > 5) {
                    int lateDays = (student.rentedDays - maxRentalDays);
                    int penalty = lateDays * penaltyPerDay;
                    System.out.println("Студент опоздал на " + lateDays + " дней");
                    System.out.println("Штраф составляет: " + penalty + " тг");
                    student.rentedDays = 0;
                }
            }
        }
    }
    void addBook(Book[] books) {

    }
}
