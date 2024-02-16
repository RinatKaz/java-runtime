package Lesson13;

public class Movie extends Media{
    int rating;

    @Override
    void display(){
        System.out.println("Рейтинг: "+rating);
    }
}
