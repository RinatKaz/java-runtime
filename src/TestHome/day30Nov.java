package TestHome;

public class day30Nov {
    public static void main(String[] args) {
        String country = "USA";
        String city = "Chicago";
        String category = "Смартфоны";
        double price = 190000;
        double dollar = 457;

        double priceAfterDiscount = calculateOrderPrice(category, price);
        double deliveryPrice = calculateDelivery(country, city) * dollar;
        double tax = calculateTax(country, city, priceAfterDiscount);
        double total = priceAfterDiscount + deliveryPrice+tax;

        System.out.println("Изначально: " + price);
        System.out.println("После применения скидок по категорий: " + priceAfterDiscount);
        System.out.println("Налог " + (priceAfterDiscount*tax/100));

        System.out.println("Доставка: " + deliveryPrice + " тг");
        System.out.println("Итого к оплате: " + total);
    }

// USA:
// New York - 14%
// Los Angeles - 13%
// для других городов 10%
// Russia:
// Moscow - 9%
// Tomsk и других городов - 8%
// для других стран - 6%
    // НАЛОГ НЕ ПРАВИЛЬНО ПРИБАВЛЯЕТ, НУЖНО В МЕТОДЕ ВСЕ ПОСЧИТАТЬ

    static double calculateTax(String country, String city, double price) {
        if (country.equals("USA")) {
            if (city.equals("New York")) {
                return 14;
            } else if (city.equals("Los Angeles")) {
                return 13;
            } else {
                return 10;
            }
        } else if (country.equals("Russia")) {
            if (city.equals("Moscow")) {
                return 9;
            } else {
                return 8;
            }
        } else {
            return 6;
        }

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
}
