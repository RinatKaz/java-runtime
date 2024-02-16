package Lesson20_Enam.Ex1;

public enum Order {

    CREATED("Создан"),
    IN_PROCESSING("В обработке"),
    ON_DELIVERY("На доставке"),
    DELIVERED("Доставлен");

    int id;
    String user;
    String product;
    String status;

    Order(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
