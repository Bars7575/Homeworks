package homeWorksGit.inheritance.task1;

public class FromAvailableStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");
        switch (requestedStatus) {
            case ARCHIVED:
                System.out.println("Книга из статуса " + book.getStatus() + " переведена в статус " + requestedStatus);
                book.setStatus(requestedStatus);
                break;
            case BORROWED:
                System.out.println("Книга из статуса " + book.getStatus() + " переведена в статус " + requestedStatus);
                book.setStatus(requestedStatus);
                break;
            default:
                System.out.println("Книга со статусом " + book.getStatus() + " не может быть переведена в статус "
                        + requestedStatus);
        }
    }
}
