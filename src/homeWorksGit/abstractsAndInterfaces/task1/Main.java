package homeWorksGit.abstractsAndInterfaces.task1;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Игра Престолов");
        SupplierAndReader supplierAndReader = new SupplierAndReader("Alex");
        AdministratorAndLibrarian administratorAndLibrarian = new AdministratorAndLibrarian("Boris");

        supplierAndReader.deliveryBook(book);
        supplierAndReader.takeBook(book);
        supplierAndReader.returnBook(book);

        administratorAndLibrarian.orderBook(new Book("Властелин колец"));
        administratorAndLibrarian.notificationBook(new Book("Дюна"), supplierAndReader);
        administratorAndLibrarian.findAndGiveOutBook(new Book("Война и мир"), new SupplierAndReader("Berik"));
    }
}
