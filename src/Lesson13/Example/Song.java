package Lesson13.Example;

public class Song extends Media{

    String performer;
    String genre;


    @Override
    void display (){
        System.out.println("Песня");
        System.out.println("Исполнитель: "+performer);
        System.out.println("Название: "+name);
        System.out.println("Год выпуска: "+ year);
        System.out.println("Жанр: "+genre);
    }


}
