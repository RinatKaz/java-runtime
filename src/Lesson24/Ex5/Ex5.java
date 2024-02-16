package Lesson24.Ex5;


public class Ex5 {
    public static void main(String[] args) {
        Product5[] products = new Product5[]{
                new Product5("Смартфоны", "Iphone 12", 319_990),
                new Product5("Смартфоны", "Samsung Galaxy S23 Ultra", 619_990),
                new Product5("Ноутбуки", "Apple MacBook Pro 14", 1_119_990),
                new Product5("Ноутбуки", "Huawei MateBook", 419_990),
                new Product5("Наушники", "Apple Airpods Max", 289_990),
                new Product5("Наушники", "Marshall Major IV", 89_990)

        };

        StringBuilder builder5 =new StringBuilder();
        for (int a = 0; a < products.length; a++) {
            builder5.append(products[a].getType())
                    .append(" ")
                    .append(products[a].getBrand())
                    .append(" ")
                    .append(products[a].getPrice());

        }

        
        int count=0;
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%s ",products[i].getType());
            System.out.printf("%"+(25)+"s ", products[i].getBrand());
            System.out.printf("%"+(10)+"d\n", products[i].getPrice());
            count=count+products[i].price;
        }
        System.out.println();
        System.out.printf("Итого: %38s",count);



    }
}

class Product5 {
    String type;
    String brand;
    int price;

    public Product5(String type, String brand, int price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
//new Product5("Смартфоны", "Iphone 12", 319_990),
//        new Product5("Смартфоны", "Samsung Galaxy S23 Ultra", 619_990),
//        new Product5("Ноутбуки", "Apple MacBook Pro 14", 1_119_990),
//        new Product5("Ноутбуки", "Huawei MateBook", 419_990)
//        new Product5("Наушники", "Apple Airpods Max", 289_990),
//        new Product5("Наушники", "Marshall Major IV", 89_990)