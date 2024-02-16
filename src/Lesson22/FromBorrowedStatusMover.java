package Lesson22;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        if (requestedStatus==Status.AVAILABLE) {
            book.setStatus(Status.AVAILABLE);
        }else if (requestedStatus==Status.ARCHIVED){
            book.setStatus(Status.ARCHIVED);
        }else if (requestedStatus==Status.OVERDUED){
            book.setStatus(Status.OVERDUED);
        }else {
            System.out.println("Перевод книги из статуса "+Status.BORROWED+ " в статус "+ requestedStatus+ " невозможен");
        }

    }
}
