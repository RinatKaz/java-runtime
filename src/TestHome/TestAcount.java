package TestHome;

public class TestAcount {
    public static void main(String[] args) {
        Account2 account = new Account2();
        account.owner="Denis";
        account.addMoney(500);
        account.addMoney(100);

        account.pay(2000);

        account.display();




    }
}
