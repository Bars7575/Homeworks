package homeWorksGit.abstractsAndInterfaces.task1;

public class AdministratorAndLibrarian implements Librarian, Administrator{
    private String name;

    public String getName() {
        return name;
    }

    public AdministratorAndLibrarian(String name) {
        this.name = name;
    }

    @Override
    public void findAndGiveOutBook(Book book, Object o) {
        System.out.println("Работник билиотеки " + name + " нашел и выдал книгу " + book.getTitle() + " " + o.toString() );
    }

    @Override
    public void notificationBook(Book book, Object o) {
        System.out.println("Работник билиотеки " + name + " напомнил о сроки сдачи книге " + book.getTitle() + " читателю " + o.toString() );
    }

    @Override
    public void orderBook(Book book) {
        System.out.println("Работник билиотеки " + name + " заказал книгу " + book.getTitle());
    }

    @Override
    public String toString() {
        return " Работник билиотеки " +
                "с именем " + name + " ";
    }
}
