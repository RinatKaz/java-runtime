package Lesson21_BigDecimal;

public class Main {
    public static void main(String[] args) {
        byte a =10;
        byte b = 20;
        System.out.println(findMax(a,b));
    }

    private static byte findMax(byte firstNumber, byte secondNumber) {
        byte max_of_bytes = (byte) Integer.max(firstNumber, secondNumber);
        return max_of_bytes;
    }
}
