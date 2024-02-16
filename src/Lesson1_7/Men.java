package Lesson1_7;

import jdk.swing.interop.SwingInterOpUtils;

public class Men {
    String name;
    String breed;
    int speed;

    void run () {

        System.out.println("Бегу");
    }
    String info () {
        return name + breed + speed;
    }

}
