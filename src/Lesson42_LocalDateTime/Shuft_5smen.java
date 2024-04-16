package Lesson42_LocalDateTime;

import java.time.LocalDateTime;

public class Shuft_5smen {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2024, 4, 17, 8, 30);
        for (int i = 1; i < 6; i++) {
            LocalDateTime shuft1 = start.plusHours(5);
            System.out.println(start + " - " + shuft1);
            start = shuft1;
        }
    }
}
