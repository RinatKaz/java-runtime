package Lesson54;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // путь /calculate?a=6&b=7
        // a + b = 13

        // путь /calculate?a=6&b=7&operation=divide
        // a : b = ?

        // путь /products?from=45000&to=100000
        // class Product(name, price)

        server.createContext("/hello", exchange -> {
            String params = exchange.getRequestURI().getQuery();
            String[] queries = params.split("&");
            int a = Integer.parseInt(queries[0].split("=")[1]);
            int b = Integer.parseInt(queries[1].split("=")[1]);


            exchange.sendResponseHeaders(200, 0);

            String response = "Example " + a + " + " + b + " = "+ (a+b);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        });

        server.start();
    }
}






// name=Dima&lastname=Alex
// ["name=Dima", "lastname=Alex"]
// ["name", "Dima"]
// ["name", "Dima&lastname", "Alex"]