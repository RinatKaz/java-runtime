package Lesson1_7;

import java.util.Random;
import java.util.Scanner;

public class November {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите операцию +,-,/,*: ");
        String cccc = scanner.next();

        switch (cccc) {
                case "+":
                    System.out.println(a + cccc + b + "= " + (a + b));
                    break;
                case "-":
                    System.out.println(a + cccc + b + "= " + (a - b));
                    break;
                case "/":
                    System.out.println(a + cccc + b + "= " + (a / b));
                    break;
                case "*":
                    System.out.println(a + cccc + b + "= " + (a * b));
                    break;
                case " ":
                    System.out.println("Вы ввели неверный знак");

            }

        }
    }



        //ПРОСТЫЕ ЧИСЛА
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        boolean isPrime = true;
//        for (int i = 2; i < number / 2; i++) {
//            if (number % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        System.out.println(number + " - " + (isPrime ? "" : "не ") + "простое число");
//    }
//}


//        int sumOfNumbers = 0;
//        for (int i = 1; i <=100 ; i++) {
//            if (i%3==0){
//                System.out.println(i);
//                sumOfNumbers = sumOfNumbers +i;
//            }
//
//        }
//        System.out.println(sumOfNumbers);



//        Scanner scanner = new Scanner(System.in);
////
//        while (true) {
//            System.out.print("Введите число: ");
//            int i = scanner.nextInt();
//            int factorial = 1;
//            for (int j = i; j > 0; j--) {
//                factorial = factorial *j;
//                System.out.println(j);
//            }
//            System.out.println(factorial);
//
//            }

//            if  (i > 1000 || i == 0) {
//                System.out.println("Число не в промежутке 1 -100 ");
//            } else if(i % 2 == 0 && i != 2 || i == 1 || i % 3 == 0 && i != 3 || i % 5 == 0 || i % 7 == 0 || i % 9 == 0) {
//                System.out.println(i + "- число не простое ");
//            } else {
//                System.out.println(i + "- число простое");
//            }
//
//
//        }











//        int x= 3;
//
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(x+"*"+i+"="+(x*i));
//            }
//        }
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int generatedNumber = random.nextInt(1,5);
//        System.out.println("Введите число: ");
//        while (true) {
//
//            int userInput = scanner.nextInt();
//            if (generatedNumber == userInput) {
//                System.out.println("Вы угадали число");
//            } else if (generatedNumber>userInput){
//                System.out.println("Вы не угадали. Загаданное число больше "+ userInput );
//            }else {
//                System.out.println("Вы не угадали. Загаданное число меньше "+ userInput );
//            }
//        }


//        Scanner s = new Scanner(System.in);
//
//        while (true){
//            System.out.print("Введите пароль: ");
//            String password = s.nextLine();
//            if (password.equals("admin")){
//                System.out.println("Доступ разрешен");
//                break;
//            }else {
//                System.out.println("Неправильный пароль");
//            }
//        }














//
//        int floor=10;
//        int flatsNumber =5;
//        int count = 0;
//        for (int i = 1; i <=floor ; i++) {
//            for (int j = 1; j <= flatsNumber; j++) {
//                count= count+1;
//                System.out.println("Этаж "+i+ ", квартира "+count + " - доставлено");
//
//            }
//
//        }




//        int day = 30;
//        int series = 3;
//
//        for (int i = 1; i <= day; i++) {
//            System.out.println("День " + i);
//            for (int j = 1; j <= series; j++) {
//                System.out.println("    Серия " + j);
//            }
//        }










//        int days =3;
//        int run = 2;
//
//        for (int i = 1; i <=days ; i++) {
//            System.out.println("День "+i);
//            for (int j = 1; j <= run; j++) {
//                System.out.println(" Пробежка "+j);



//        int counter =0 ;
//        for (int i = 0; i <10 ; i++) {
//            if (i>7){
//                counter=counter+2;
//            }
//            counter=counter+1;
//        }
//        System.out.println(counter);




//        int megabites = 32000;
//        int gigabites = 32 ;
//
//        int megabitesss = 32 * 1024;
//        boolean is = megabites >megabitesss;
//        System.out.println(is);
//        double rateUSD = 444.06;
//        double tenges = 124356.5;
//
//        if rateUSD < 450;
//        {
//            System.out.println("Отличный курс доллара- рекомендую купить!");
//        }
//        else;
//        {
//            System.out.println("Рекомендую не покумать доллары");
//        }
//
//        double rateUSD = 444.06;
//        double tenges = 124356.5;
//        double usdInTenge = tenges / rateUSD;
//        if (rateUSD < 450) {
//            System.out.println("Отличный курс доллара - рекомендую купить!");
//        } else {
//            System.out.println("Не рекомендую покупать!");
//        }
//        System.out.println("Ваши сбережения в долларах: " + usdInTenge);
//
//
//        int a = 5;
//        int b = 7;
//        boolean isAMoreThatB = a < b;
//        System.out.println(isAMoreThatB);
//
//        int megabyte = 32000;
//        int gigabyte = 32;
//        boolean megabyteInGigabite = megabyte > gigabyte * 1024;
//        System.out.println(megabyteInGigabite);
//
//        System.out.println("_________________");
//
//        double price = 11000;
//        double percent = 20;
//
//        if (price > 10000) {
//            if (percent >= 5 && percent <= 50) {
//                double sale = price * (percent / 100);
//                price -= sale;
//                System.out.println("Вам предоставили " +  (int) percent + "% скидку, что составило: " + sale);
//            } else {
//                System.out.println("Ошибка: скидка должна быть не меньше 5 и не больше 50");
//            }
//        } else {
//            System.out.println("Скидка не доступна");
//        }
//        System.out.println("Итого к оплате: " + price);
//
//
//
//
//
//        System.out.println("_______________");
//        System.out.println("__Система скидок по категориям___");
//
//        String category = "одежда";
//        double price1 = 1000;
//
//        if (category.equals("техника") && price1 > 10000){
//            System.out.println("Скидка составляет - 20%: "+ price1*0.2);
//        }else if (category.equals("одежда")){
//            System.out.println("Скидка составляет - 10%: "+ price1*0.1);
//        }else if (category.equals("продукты")&& price1> 1000){
//            System.out.println("Скидка составляет - 200: "+ price1);
//        }else {
//            System.out.println("Скидка не предоставляется");
//        }
//        System.out.println();
//
//
//
//
//
//
//        System.out.println("___Выбор университета____");
//
//        String rating = "высокий";
//        int price2 = 90_000;
//        String speciality = "финансы";
//        boolean scholarship = true;
//        boolean popular_faculties = true;
//
//        if (rating.equals("высокий")&& price2<100000){
//            System.out.println("Университет подходит по стоимости");
//        }else if (rating.equals("средний")&& speciality.equals("финансы")&& price2<50000){
//            System.out.println("Университет подходит по специальности и по стоимости");
//        }else if (rating.equals("низкий")&& (scholarship = true) && (popular_faculties = true)){
//            System.out.println("Университет может быть рассмотрен как подходящий вариант");
//        }else {
//            System.out.println("Поищите университет с более высоким рейтингом");
//        }
//
//
//
//
//
//
//
//        System.out.println();
//        System.out.println("___________________________________________");
//
//
//        int weight = 7;
//        if (weight <= 5) {
//            System.out.println("Доставка 5 $");
//        } else if (weight <= 20) {
//            System.out.println("Доставка 10$");
//        } else {
//            System.out.println(" Доставка 20$");
//        }
//        int weightOrder1 = 43;
//        int weightOrder2 = 23;
//        int summ = weightOrder1 + weightOrder2;
//        if (summ < 10) {
//            System.out.println("Общий вес в нужном диапазоне");
//        } else {
//            System.out.println("Общий вес не находится в нужном диапазоне");
//        }
//        String country = "Germany";
//        double cost = 600;
//        if (country.equals("Germany") || country.equals("Austria") && cost > 500) {
//            System.out.println("Представить скидку 10%");
//        } else if (country.equals("Spain") && cost > 300) {
//            System.out.println("Представить скидку 5%");
//        } else {
//            System.out.println("Скидка не предоставляется");
//        }

//        double price = 1000;
//        double percent = 20;
//        double percentVtenge = price / 100 * 20;
//
//        if (price > 10000) {
//            if (percent > 5 && percent < 50) {
//                System.out.println("Вам предоставили \" + percent + \"скидку, что составило:\" + percentVtenge");
//            } else {
//                System.out.println("Ошибка: скидка должна быть не меньше 5 и не больше 50");
//            }
////        else if ()
//
//    {
//        System.out.println("Вам предоставили " + percent + "скидку, что составило:" + percentVtenge);
//    } else  if ()
//        }


