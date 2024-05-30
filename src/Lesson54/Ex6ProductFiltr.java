package Lesson54;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

public class Ex6ProductFiltr {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

       List<Product>products=new ArrayList<>();
       products.add(new Product("bread",200));
        products.add(new Product("lemon",300));
        products.add(new Product("apple",350));
        products.add(new Product("juice",500));
        products.add(new Product("milk",300));
        products.add(new Product("carrot",250));
        products.add(new Product("potato",200));


        List<Product>newproducts = new ArrayList<>();

        server.createContext("/products", exchange -> {
            String params = exchange.getRequestURI().getQuery();
            String[] queries = params.split("&");
            int from = Integer.parseInt(queries[0].split("=")[1]);
            int to = Integer.parseInt(queries[1].split("=")[1]);


            for (int i = 0; i < products.size(); i++) {
                if(products.get(i).Price>=from && products.get(i).Price<=to){
                    newproducts.add(new Product(products.get(i).name,products.get(i).Price));
                }
            }

            exchange.sendResponseHeaders(200, 0);

            String response = "Product " + from + " - " + to + newproducts;
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        });

        server.start();
    }
}

class Product {
    String name;
    int Price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }

    public Product(String name, int price) {
        this.name = name;
        Price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}

// путь /calculate?a=6&b=7
// a + b = 13

// путь /calculate?a=6&b=7&operation=divide
// a : b = ?

// путь /products?from=45000&to=100000
// class Product(name, price)