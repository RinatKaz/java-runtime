package Lesson22;

public enum Status {
    AVAILABLE("Доступно"),
    BORROWED("В пользовании"),
    ARCHIVED("В архиве"),
    OVERDUED("Задержана");

    private String text;

    Status(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

