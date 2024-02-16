package Lesson20_Enam.DayOfWeek;

public class Test {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY; // enum объект = enum один из объектов
        VeryStrictDiet veryStrictDiet = new VeryStrictDiet();// класс СтрогаяДиета объект строгаяДиета = new СтрогаяДиета
        veryStrictDiet.takeLunch(dayOfWeek); // объект строгаяДиета метод ПолучитьОбед(день недели)
    }
}
