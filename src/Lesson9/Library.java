package Lesson9;

public class Library {
    Book availableBook;


    void lendBook(Student student, int days) { // метод одалживания книги

        if (availableBook != null && student.borrowedBook == null) {//если книга Доступна и студент не одалживал книгу
            student.borrowedBook = availableBook;// то студент одолжил доступную книгу
            availableBook = null;// доступной книги теперь нет
            System.out.println("Дней: "+ days);
            if (days >5) {
                int shtraf= (days - 5)*5000;
                System.out.println("Штраф: "+ shtraf);
            }
        } else {
            System.out.println("Книга не доступна");
        }
    }

    void acceptBook(Student student) { //метод принятия
        if (availableBook == null && student.borrowedBook != null){ //если доступной книги НЕТ и студент одолжил книгу
            availableBook = student.borrowedBook; // доступная книга у студента
            student.history += availableBook.title + " "; //в историю студента добавляется название доступной книги
            student.borrowedBook = null;//студент не одолжил книгу??????????
        }
    }

}
