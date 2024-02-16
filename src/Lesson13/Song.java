package Lesson13;

public class Song extends Media{
    String genre;

    @Override
    void display(){

        System.out.println("Рейтинг: "+genre);
    }
}
