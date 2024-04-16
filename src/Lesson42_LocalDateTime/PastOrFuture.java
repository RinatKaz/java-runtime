package Lesson42_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class PastOrFuture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Введите дату: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate now = LocalDate.now();

            LocalDate date1;
            date1 = LocalDate.of(year,month,day);

            if (date1.isAfter(now)){
                System.out.println("Будущее");
            }else {
                System.out.println("Прошлое");
            }
        }
    }

