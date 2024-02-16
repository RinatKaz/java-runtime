package TestHome;

public class TestMethodManager {
       void amountOfDaysByMonth(int month){
           switch (month){
               case 1,3,5,7,8,10,12:
                   System.out.println("31 день");
                   break;
               case 4,6,9,11:
                   System.out.println("30 дней");
                   break;
               case 2:
                   System.out.println("либо 29 либо 28");
                   break;
               default:
                   System.out.println("некорректный номер");
           }
       }

       void greeting (String name, String city){
           System.out.println("Меня зовут "+name);
           System.out.println("Я из города "+city);
       }

       void calculateDiscountByCategory(String category, double price ){
           System.out.println("Изначальная цена "+price);
           switch (category){
               case "Смартфоны":
                   price=price*0.8;
                   break;
               case "Ноутбуки":
                   price=price*0.85;
                   break;
               case "Наушники":
                   price=price*0.8;
                   break;
               default:
                   System.out.println("скидка не действует");
           }
           System.out.println("Цена с учетом скидки "+price);

       }

}

