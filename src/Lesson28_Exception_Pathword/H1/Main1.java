package Lesson28_Exception_Pathword.H1;


import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        //Проверить логин и пароль

        try {
            User user =getUserByLoginAndPassword(login, password);
            validateUser(user);
            System.out.println("Доступ предоставлен");
        } catch (UserNotFoundException | AccessDeniedException e){
            System.out.println(e.getMessage());
        }



        //Вызвать методы валидации пользователя


    }


    public static User[] getUsers() {
        User user1 = new User("jhon", "pass1", "jhon@gmail.com", 24);
        User user2 = new User("tom", "pass2", "tom@gmail.com", 25);
        User user3 = new User("sam", "pass3", "sam@gmail.com", 34);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword()) ){
                return user ;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Возраст менее 18 лет");
        }

    }
}

