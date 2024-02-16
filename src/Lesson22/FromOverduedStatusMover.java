package Lesson22;

public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        if (requestedStatus==Status.AVAILABLE) {
            book.setStatus(Status.AVAILABLE);
        }else if (requestedStatus==Status.ARCHIVED){
            book.setStatus(Status.ARCHIVED);
        }else {
            System.out.println("Перевод книги из статуса "+Status.OVERDUED+ " в статус "+ requestedStatus+ " невозможен");
        }

    }
}
