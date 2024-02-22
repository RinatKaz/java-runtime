package Lesson28_Exception_Pathword.Home;

public class Ex1 {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

