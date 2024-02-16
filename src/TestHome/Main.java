package TestHome;

public class Main {
    public static void main(String[] args) {
        Account denis = new Account();
        denis.owner = "Denis";
        denis.addMoney(1500);

        Product product = new Product();
        product.name = "Хлеб";
        product.price = 190;

        denis.buy(product);

    }
}

