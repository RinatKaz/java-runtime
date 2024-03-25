package Lesson36_binarniiPoisk.Home_1;

import Lesson35.HomeEx1.Contact;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<Student> hSet1 = new HashSet<>();


        for (Student student11 : hSet1) {
            System.out.println(student11);
        }
        while (true) {
            System.out.println("1.Ввод информации о студенах");
            System.out.println("2.Вывод списка студентов");

            int command = scanner.nextInt();
            scanner.nextLine();
            if (command == 1) {
                    System.out.println("Введите Ф.И.О.: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите номер группы: ");
                    String groupNumber = scanner.nextLine();
                    System.out.println("Введите номер студенческого билета: ");
                    String studentIdNumber = scanner.nextLine();
                    Student studentAdd = new Student(name, groupNumber, studentIdNumber);
                    hSet1.add(studentAdd);

            } else if (command == 2) {
                System.out.println("Список студентов: ");
                for (Student student11 : hSet1) {
                    System.out.println(" - "+student11.name+", "+student11.groupNumber+", "+student11.studentIdNumber);
                } break;
            } else {
                break;
            }
        }
    }
}

