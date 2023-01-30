package homeWorksGit.exceptions.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        try {
            getUserByLoginAndPassword(login, password);
            validateUser(getUserByLoginAndPassword(login, password));
            System.out.println("Доступ предоставлен");
        }catch (UserNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch (AccessDeniedException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static User[] getUsers(){
        User user1 = new User("Alex", "Qazwsx", "Alex@gmail.com", 15);
        User user2 = new User("Berik", "Qazwsx123", "Berik@gmail.com", 19);
        User user3 = new User("John", "123Qazwsx", "John@gmail.com", 25);

        return new User[] {user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if(user.getLogin().equals(login) && user.getPassword().equals(password)){
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Access Denied");
        }
    }
}
