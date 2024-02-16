package TestHome;

public class Account2 {
    String owner;
    double balance;

    void addMoney(double money){
        balance+=money;
    }
    void pay (double money) {
        if (balance>=money){
            balance -= money;
        }else {
            System.out.println("Недостаточно денег");
        }

    }


    void display(){
        System.out.println("Владелец: "+ owner);
        System.out.println("Баланс "+balance);
    }
}
