package Lesson24.Ex4;

public class Ex {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("Iphone 12", 319_990),
                new Product("Apple Vision Pro", 1_899_990),
                new Product("Marshall Major IV", 89_990),
                new Product("Airpods Max", 289_990)
        };

        StringBuilder builder2 = new StringBuilder();

        String count = "";
        for (int i = 0; i < products.length; i++) {
            builder2.append(i+1)
                    .append(".")
                    .append(products[i].getName())
                    .append("(")
                    .append(products[i].getPrice())
                    .append(") \n");
            count = builder2.toString();
            count=builder2.toString();
        }
        System.out.println(count);


        int characters=products[0].toString().length();
        for (int i = 0; i < products.length; i++) {
            if (products[i].toString().length()> characters){
                characters=products[i].toString().length();
            }
        }
        characters= characters*-1;

        System.out.println(characters);//самое большое количество символов

        for (int i = 0; i < products.length; i++) {
            System.out.printf((i+1)+". %" + (-20) + "s ", products[i].getName());
            System.out.printf("(%d тг)\n",products[i].getPrice());

        }



    }


}

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
