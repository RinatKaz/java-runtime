package Lesson13.Example;

public class Movie extends Media{
    double rating;

    @Override
    void display(){
        System.out.println("Фильм");
        System.out.println("Название: "+name);
        System.out.println("Год выпуска: "+ year);
        System.out.println("Рейтинг: "+rating);
    }
}
