package Lesson12Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book();
        book.title = "1984";
        book.author = "George Orwell";

        Book book1 = new Book();
        book1.title = "testBook";
        book1.author = "testAuthor";

        library.books = new Book[10];
        library.addBook(book);
        library.addBook(book1);
        System.out.println(library.books.length);

//        System.out.println(Arrays.toString(library.books));
        Student student = new Student();
        student.name = "Alexey";
        student.display();

        library.lendBook(student, "asdgv", 7);
        student.display();

        library.acceptBook(student);
        student.display();

    }
}