package Lesson31.Ex1.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Products> products = new ArrayList<>();

        products.add(new Products("Apple", 50));
        products.add(new Products("Bread", 20));
        products.add(new Products("Milk", 25));

        for (Products product : products) {
            System.out.println(product.getName() + "- " + product.getPrice());
        }
        int total = 0;
        for (int i = 0; i < products.size(); i++) {
            total = total + products.get(i).getPrice();
        }
        System.out.println("Общая сумма товаров = " + total);

        int max = products.get(0).getPrice();
        String name1= products.get(0).getName();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > max) {
                max = products.get(i).getPrice();
                name1= products.get(i).getName();
            }
        }
        System.out.println("Самый дорогой товар - "+ name1+ " " + max);
    }
}

