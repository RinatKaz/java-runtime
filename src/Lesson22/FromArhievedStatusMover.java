package Lesson22;

public class FromArhievedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

            if (requestedStatus==Status.BORROWED) {
                book.setStatus(Status.BORROWED);
            }else if (requestedStatus==Status.ARCHIVED){
                book.setStatus(Status.ARCHIVED);
            }else {
                System.out.println("Перевод книги из статуса "+Status.ARCHIVED+ " в статус "+ requestedStatus+ " невозможен");
            }

        }

    }
