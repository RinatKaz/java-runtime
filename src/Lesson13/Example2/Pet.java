package Lesson13.Example2;

public class Pet {
    String voice;
    int pawsCount;

    public Pet(String voice, int pawsCount) {
        this.voice = voice;
        this.pawsCount = pawsCount;
    }

    void getPawsCount(){
        System.out.println("Количество лап: "+ pawsCount);
    }
}
