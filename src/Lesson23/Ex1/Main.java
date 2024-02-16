package Lesson23.Ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String months = "ЯНВАРЬ-ФЕВРАЛЬ-МАРТ-АПРЕЛЬ-МАЙ-ИЮНЬ-ИЮЛЬ-АВГУСТ-СЕНТЯБРЬ-ОКТЯБРЬ-НОЯБРЬ-ДЕКАБРЬ";

        String[] a = months.split("-");
        System.out.println(Arrays.toString(a));
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

            if ((a[i].contains("Б")) ||
                    (a[i].contains("В")) ||
                    (a[i].contains("Г")) ||
                    (a[i].contains("Д")) ||
                    (a[i].contains("Ж")) ||
                    (a[i].contains("З")) ||
                    (a[i].contains("К")) ||
                    (a[i].contains("Л")) ||
                    (a[i].contains("М")) ||
                    (a[i].contains("Н")) ||
                    (a[i].contains("П")) ||
                    (a[i].contains("Р")) ||
                    (a[i].contains("С")) ||
                    (a[i].contains("Т")) ||
                    (a[i].contains("Ф")) ||
                    (a[i].contains("Х")) ||
                    (a[i].contains("Ц")) ||
                    (a[i].contains("Ч")) ||
                    (a[i].contains("Ш")) ||
                    (a[i].contains("Щ"))) {
                count++;
            }
            System.out.println(count);

        }


    }
}
