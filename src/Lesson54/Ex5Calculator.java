package Lesson54;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Ex5Calculator {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // путь /calculate?a=6&b=7
        // a + b = 13

        // путь /calculate?a=6&b=7&operation=divide
        // a : b = ?

        // путь /products?from=45000&to=100000
        // class Product(name, price)

        server.createContext("/hello1", exchange -> {
            String params = exchange.getRequestURI().getQuery();
            String[] queries = params.split("&");
            int a = Integer.parseInt(queries[0].split("=")[1]);
            int b = Integer.parseInt(queries[1].split("=")[1]);
            String operation = queries[2].split("=")[1];

            int c;
            String sign=null;

            if (operation.equals("plus")){
                c=a+b;
                sign=" + ";
            } else if (operation.equals("minus")) {
                c=a-b;
                sign=" - ";
            } else if (operation.equals("divide")) {
                c=a/b;
                sign = "/";
            } else if (operation.equals("multiply")) {
                c=a*b;
                sign="*";
            }else {
                c=0;
            }

            exchange.sendResponseHeaders(200, 0);

            String response = "Example " + a + sign + b + " = "+ c;
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        });

        server.start();
    }
}
