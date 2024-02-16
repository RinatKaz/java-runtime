package TestHome;


public class Account {
    String owner;
    double balance;

    void buy(Product product) {
        // проверяете стоимость товара
        if (balance >= product.price) {
            balance -= product.price;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    void transfer(Account otherAccount, double money) {
        if (balance >= money) {
            otherAccount.balance += money;
            balance -= money;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    void addMoney(double money) {
        balance += money;
        System.out.println("added " + money);
    }

    void display() {
        System.out.println("Владелец: " + owner);
        System.out.println("Баланс: " + balance);
        System.out.println();
    }
}
