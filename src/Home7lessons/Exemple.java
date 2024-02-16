package Home7lessons;

public class Exemple {
    public static void main(String[] args) {
        Exemple exemple = new Exemple();
        exemple.greeting(01);
    }

    void greeting (int hours ) {
        switch (hours) {
            case 6, 7, 8, 9, 10:
                System.out.println("Доброе утро!");
                break;
            case 11, 12, 13, 14, 15, 16, 17, 18:
                System.out.println("Добрый день!");
                break;
            case 19, 20, 21:
                System.out.println("Добрый вечер!");
                break;
            case 22, 23, 00, 01, 02, 03, 04, 05:
                System.out.println("Доброй ночи!");
                break;
        }
    }
}


