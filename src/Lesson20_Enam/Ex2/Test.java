package Lesson20_Enam.Ex2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Seasons season = Seasons.AUTUMN;

        if (season == Seasons.AUTUMN){
            System.out.println("Осень");
        }else {
            System.out.println("Error");
        }


//        Seasons[] seasonss = Seasons.values();
//        System.out.println(Arrays.toString(seasonss));
//        }

        for (Seasons season1:Seasons.values()) {
            System.out.println(season1);
        }
    }
}

