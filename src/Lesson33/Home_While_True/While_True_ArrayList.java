package Lesson33.Home_While_True;

import java.util.ArrayList;
import java.util.Scanner;

public class While_True_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход ");
            System.out.println();

            int command = scanner.nextInt();
            scanner.nextLine();
            if (command == 1) {
                System.out.println("Введите задачу для планирования: ");
                list1.add(scanner.nextLine());
            } else if (command == 2) {
                for (int i = 0; i < list1.size(); i++) {
                    System.out.println(list1.get(i));
                }
            } else if (command == 3) {
                System.out.println("Введите индекс задачи для удаления");
                list1.remove(scanner.nextInt()-1);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Данной команды нет в списке");
            }
        }
    }
}
