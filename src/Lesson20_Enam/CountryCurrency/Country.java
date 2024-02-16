package Lesson20_Enam.CountryCurrency;

public enum Country {
    CANADA ("Cad"),
    USA("USD"),
    GERMANY("EUR");

    private String currency;

    Country(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
