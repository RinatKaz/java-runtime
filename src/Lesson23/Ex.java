package Lesson23;

public class Ex {
    public static void main(String[] args) {
        String text = "application hello template";
        String word = "hello";

        if (text.contains(word)){
            System.out.println("Есть");
        }else {
            System.out.println("Нет");
        }
    }
}
