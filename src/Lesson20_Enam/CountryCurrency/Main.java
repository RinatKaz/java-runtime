package Lesson20_Enam.CountryCurrency;

public class Main {
    public static void main(String[] args) {
        for (Country country : Country.values()) {
            System.out.println(country + ":" + country.getCurrency());


        }
    }
}
