package Lesson13.ExMedia;

public class Song extends Media {
    String genre;

    @Override
    public void display(){
        System.out.println("Название песни: "+name);
        System.out.println("Год выпуска: "+year);
        System.out.println("Жанр:"+genre);
    }
}
