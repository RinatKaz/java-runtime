package Lesson22;

public class BookMover {
    String book;
    String status;

    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");
    }
}
