package TestHome;

public class TestMethod {
    public static void main(String[] args) {
        TestMethodManager manager = new TestMethodManager();
        manager.amountOfDaysByMonth(22);

        manager.greeting("Руслан","Астана");

        manager.calculateDiscountByCategory("Наушники",10000);

    }
}
