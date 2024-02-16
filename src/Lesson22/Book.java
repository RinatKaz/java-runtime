package Lesson22;

public class Book {
    String title;
    Status status;

    public Book(String title) {
        this.title = title;
        status = Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
