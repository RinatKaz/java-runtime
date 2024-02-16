package Lesson9.Song;

public class Main {
    public static void main(String[] args) {
        Perfomer artist = new Perfomer();
        artist.name = "performer1";

        Song pesnya = new Song();
        pesnya.title = "song1";
        pesnya.genre= "rock";
        pesnya.perfomer111 = artist;

        System.out.println(pesnya.perfomer111.name);

        Song pesnya2 = new Song();
        pesnya2.title = "song2";
        pesnya2.genre="rockkkk";

        System.out.println(pesnya2.title);

    }
}
