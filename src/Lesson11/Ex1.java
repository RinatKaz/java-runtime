package Lesson11;

public class Ex1 {
    public static void main(String[] args) {
        int positiv = 0;
        int negativ = 0;
        int numberMax=0;
        int numberMin=0;
        int[] massiv = {7, -3, 9, -11, 18, 99, 2, 11};

//        for (int i = 0; i < massiv.length; i++) {
//            if (massiv[i] < 0) {
//                negativ += 1;
//            }else{
//                positiv += 1;
//            }
//        }
//        System.out.println("Положительных чисел: " + positiv + ". Отрицательных чисел: " + negativ);
//
//        for (int i  : massiv) {
//            if (i < 0) {
//                negativ += 1;
//            }else{
//                positiv += 1;
//            }
//        }
//        System.out.println("Положительных чисел: " + positiv + ". Отрицательных чисел: " + negativ);

        for (int i = 1; i <massiv.length ; i++) {
            if (numberMax<=massiv[i]){
                numberMax= massiv[i];
            }else  if (numberMin>=massiv[i]){
                    numberMin=massiv[i];
                }
            }
        System.out.println(numberMax);
        System.out.println(numberMin);
    }

}

