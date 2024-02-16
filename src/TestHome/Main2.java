package TestHome;

public class Main2 {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title="The Dark Knight";
        movie.genre="Action";

        Product2 product = new Product2();
        product.name ="Pizza";
        product.price=5;
        product.Info();

        Product2 product1 = new Product2();
        product1.name = "Pasta";
        product1.price =4;

        product.display();
        product1.display();






    }
}
