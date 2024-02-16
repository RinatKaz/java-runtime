package Obekt;

public class MethodManager {
    void amountOfDaysByMonth(int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10:
                System.out.println("31 день");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 дней");
                break;
            case 2:
                System.out.println("либо 29 либо 28");
                break;
            default:
                System.out.println("Некорректный номер");

        }
    }

    void calculatDiscountByCategory(String category, double price) {
        switch (category){
            case "смартфоны":
                System.out.println("С учетом скидки"+(price-(price*0.2)));
                break;
            case "Ноутбуки":
                System.out.println("С учетом скидки"+ (price-(price*0.15)));
                break;
            case "Наушники":
                System.out.println("С учетом скидки"+ (price-(price*0.2)));
                break;
            default:
                System.out.println("Скидка не действует");

        }


    }
}
