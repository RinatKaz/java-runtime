package Lesson8;

public class Practice {
    public static void main(String[] args) {
        calculaterOrder( "USA", "Chicago", "Смартфоны", 190000);
        System.out.println();
        calculaterOrder( "Russia", "Moscow", "Ноутбуки", 590000);
    }
    static void calculaterOrder (String country, String city, String category, double price) {
        double priceAfterDiscount = calculateOrderPrice(category, price);
        double deliveryPrice = calculateDelivery(country,city)*457;
        double tax = calculateTax(country, city ,priceAfterDiscount);
        double total = priceAfterDiscount+deliveryPrice+tax;

        System.out.println("Изначально: " + price);
        System.out.println("После применения скидок по категории: " + priceAfterDiscount);
        System.out.println("Налог: "+tax);
        System.out.println("Доставка: "+ deliveryPrice +"тг");
        System.out.println("Итого к оплате: "+ total);
    }


    static double calculateOrderPrice(String category, double productPrice) {
        switch (category) {
            case "Смартфоны":
                return productPrice * 0.9;
            case "Ноутбуки":
                return productPrice * 0.85;
            default:
                return productPrice;
        }
    }

    static double calculateDelivery(String country, String city) {
        if (country.equals("USA")) {
            if (city.equals("New York") || city.equals("Los Angeles")) {
                return 0;
            } else {
                return 10;
            }

        } else if (country.equals("Russia")) {
            if (city.equals("Moscow") || city.equals("Tomsk")) {
                return 20;
            } else {
                return 25;
            }
        } else {
            return 35;
        }
    }
    static double calculateTax(String country,String city, double price){
        if (country.equals("USA")){
            if (city.equals("New York")) {
                return price * 0.14;
            } else if (city.equals("Los Angeles")){
                return price* 0.13;
            }else {
                return price*0.1;
            }
        }else if (country.equals("Russia")){
            if (city.equals("Moscow")){
                return price*0.09;
            }else {
                return price*0.08;
            }
        }else {
            return price*0.06;
        }

    }
}
