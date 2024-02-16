package Lesson13.Example;

public class Main {
    public static void main(String[] args) {
        Media media = new Media();
        media.name="Чернобыль";
        media.year=2019;
        media.display();
        System.out.println();

        media.test(4999);
        media.test("Слово");
        media.test(9.4);
        System.out.println();

        Choice choice = new Choice();

        Song song1= new Song();
        choice.choicePeople(song1);


//        Movie movie = new Movie();
//        movie.name="Oppenheimer";
//        movie.year= 2023;
//        movie.rating= 8.2;
//        movie.display();
//        System.out.println();
//
//        Song song = new Song();
//        song.name= "Cuff it";
//        song.performer = "Beyonce";
//        song.year= 2022;
//        song.genre = "R&B";
//        song.display();


    }
}
