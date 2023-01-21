package homeWorksGit.inheritance.task1;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", Status.AVAILABLE);
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.toString());
        System.out.println();

        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        fromBorrowedStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.toString());
        System.out.println();

        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();
        fromArchivedStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.toString());
        System.out.println();
    }
}
