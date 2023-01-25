package homeWorksGit.abstractsAndInterfaces.task1;

public class SupplierAndReader implements Reader, Supplier{
    private String name;

    public String getName() {
        return name;
    }

    public SupplierAndReader(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(Book book) {
        System.out.println("Доставщик " + name + " взял книгу " + book.getTitle() );
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Доставщик " + name + " вернул книгу " + book.getTitle() );
    }

    @Override
    public void deliveryBook(Book book) {
        System.out.println("Доставщик " + name + " доставил книгу " + book.getTitle() + " в билиотеку" );
    }

    @Override
    public String toString() {
        return "Доставщик по имени " + name + " ";
    }
}
