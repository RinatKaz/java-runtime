package Lesson11Massiv;

public class Main {
    public static void main(String[] args) {
        Performer performer = new Performer();//создали объект перформер
        performer.name = "David Bowie";// дали имя полю name в классе перформер
        performer.songs = new Song[5];// создали массив из 5 элементов в классе перформер
        performer.show();

        Song song = new Song();
        song.title = "song1";
        song.duration = 90;
        performer.addSong(song);

        song = new Song();
        song.title = "song2";
        song.duration = 95;
        performer.addSong(song);
        performer.show();



    }
}
