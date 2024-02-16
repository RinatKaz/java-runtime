package Lesson13.ExMedia;

public class Main {
    public static void main(String[] args) {


    Media media = new Media();
    media.name="Первый канал";
    media.year=1995;
    media.display();
        System.out.println();

    Movie movie= new Movie();
    movie.name="Титаник";
    movie.year= 1997;
    movie.rating=8.4;
    movie.display();
        System.out.println();

    Song song = new Song();
    song.name = "My Heart Will Go On";
    song.year= 1997;
    song.genre="pop";
    song.display();


    }
}
