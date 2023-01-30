package homeWorksGit.exceptions.task2;

public class Main {

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Престиж", 0, 17),
                new Movie("Помни", 2005, 18)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Евгений Онегин", 2005, 15),
                new Theatre("Руслан и Людмила", 0, 10)
        };
    }

    public static void validEvent(Event[] events) throws RuntimeException {
        for (Event event:events) {
            if (event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle().equals(null)) {
                throw new RuntimeException("Есть не запоненые значения в " + event.toString());
            }
        }
    }

    public static void main(String[] args) throws RuntimeException {

        try {
            validEvent(getMovies());
            System.out.println("Все события корректны");
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        try {
            validEvent(getTheatres());
            System.out.println("Все события корректны");
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

    }
}
