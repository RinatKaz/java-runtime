package Lesson28_Exception_Pathword;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите почту");
        String email = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        System.out.println("Email " + (validateEmail(email) ? "подходит" : "не подходит"));
        System.out.println("Пароль " + (validatePassword(password) ? "подходит" : "не подходит"));
    }

    // Создать собственное исключение
    static boolean validatePassword(String password) {
        if (password.length() < 8) {
            throw new Test404("Пароль должен содержать 8 символов");
        }


        boolean hasUpperCase = false;
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpperCase = true;
            }

            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }

            if (hasUpperCase && hasDigit) {
                return true;
            }
        }

        if (!hasUpperCase) {
            throw new Test404("Должна быть хоть одна заглавная буква");
        }

        throw new Test404("Должна быть хоть одна цифра");


    }


    static boolean validateEmail(String email) {
        return email.contains("@") && !email.contains(" ");
    }
}
