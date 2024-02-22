package Lesson27_Library.HomeEx;

public class Song {

        private final String title;
        private final String artist;
        private final String songwriter;

        // переопределите метод equals(Object)


    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songwriter='" + songwriter + '\'' +
                '}';
    }

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;


    }
}

