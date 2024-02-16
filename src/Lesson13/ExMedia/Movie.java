package Lesson13.ExMedia;

public class Movie extends Media {
    double rating;

    @Override
    public void display(){
        System.out.println("Название фильма: "+name);
        System.out.println("Год выпуска: "+year);
        System.out.println("Рейтинг: "+rating);
    }
}
