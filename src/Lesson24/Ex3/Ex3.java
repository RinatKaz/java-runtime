package Lesson24.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        String []cities = {
                "Астана", "Лос-Анджелес", "Санкт-Петербург", "Вена"
        };
        int count = cities[0].length();
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].length()>count){
                count=cities[i].length();
            }
        }
        System.out.println(count);

        for (String city : cities) {
            System.out.printf("%"+count+"s\n", city);
            
        }
    }
}
