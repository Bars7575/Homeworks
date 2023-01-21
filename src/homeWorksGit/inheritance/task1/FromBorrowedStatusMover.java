package homeWorksGit.inheritance.task1;

public class FromBorrowedStatusMover extends BookMover{

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");
        switch (requestedStatus) {
            case BORROWED:
                System.out.println("Книга со статусом " + book.getStatus() + " не может быть переведена в статус "
                        + requestedStatus);
                break;
            default:
                System.out.println("Книга из статуса " + book.getStatus() + " переведена в статус " + requestedStatus);
                book.setStatus(requestedStatus);
        }
    }
}
