package Lesson42_LocalDateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class FriendsBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LocalDate> list1 = new HashMap<>();
        LocalDate today = LocalDate.now();

        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить друга");
            System.out.println("2. Узнать сколько дней осталось до дня рождения друга");
            System.out.println("3. Вывод всех друзей");
            System.out.println("0. Выход");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 1) {
                System.out.print("Имя друга: ");
                String listName = scanner.nextLine();
                System.out.print("Введите дату (год месяц день): ");
                String input = scanner.nextLine();
                String bDay = input.replace(" ", "-");

                LocalDate bDay1 = LocalDate.parse(bDay);
                list1.put(listName, bDay1);
            } else if (command == 2) {
                System.out.print("Имя друга: ");
                LocalDate findNameBD = list1.get(scanner.nextLine());//вводим имя друга и по ключу ищем др
                LocalDate newFindNameBD = LocalDate.of(today.getYear(), findNameBD.getMonth(), findNameBD.getDayOfMonth());
                Period old = Period.between(findNameBD, today);
                Period oldFriend = old.plusYears(1);
                if (newFindNameBD.isAfter(today)) {
                    System.out.println("Будущее");
                    Period period = Period.between(today, newFindNameBD);
                    System.out.println("Осталось  " + period.getDays() + " дней. Исполнится " + oldFriend.getYears());
                } else {
                    long days = ChronoUnit.DAYS.between(newFindNameBD, today);
                    System.out.println("Осталось  " + (365 - days) + " дней . Исполнится " + oldFriend.getYears());
                }
            } else if (command == 3) {
                for (String s : list1.keySet()) {
                    System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1) + " - " + list1.get(s).getDayOfMonth() + " " + list1.get(s).getMonth().getDisplayName(TextStyle.FULL, Locale.of("ru")) + " " + list1.get(s).getYear());
                }
            } else if (command == 0) {
                break;
            }
        }
    }
}
