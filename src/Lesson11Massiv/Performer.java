package Lesson11Massiv;

public class Performer {
    String name;
    Song [] songs;

    void addSong(Song song){
        for (int i = 0; i < songs.length; i++) {
            if (songs[i]==null){
                songs[i]=song;
                break;
            }
        }

    }

    void show (){
        System.out.println(name);
        printSongs();
    }

    void printSongs(){
        System.out.println("Песни: ");
        for (Song song : songs) {
            if (song != null){
                System.out.println(song.title+" "+song.duration);
            }
        }
    }
}
