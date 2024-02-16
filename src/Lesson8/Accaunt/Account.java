package Lesson8.Accaunt;

public class Account {
    boolean accountIsBlocked;
    String owner;//Держатель карты
    double balance;//баланс Основного счета в тенге
    String history;//счетчик покупок
    double spentMoney;// Сумма потраченных денег
    double spendingLimit = 10000;//Лимит трат
    double transferFee = 50;//Комиссия за перевод;
    double minimumAddAmount = 500;//Минимальная сумма для пополнения
    double balanceUSDinKZT;//баланс Доллорового счета в KZT
    double rateUSD = 457.08;//курс Тенге/USD
    double balanceEUR;// баланс Еврового счета в EUR
    double rateEUR = 498.18;//курс Тенге/EUR
    double balanceRUB; // баланс Рублевого счета
    double rateRUB = 5.11;//курс Тенге/RUB


/////////////////------ТРАНСФЕР ВАЛЮТЫ-------///////////////////

    void rateMethod(double money, double currencyInKZT, double rate, String nameCurrency) {

        if ((money + transferFee) < balance) {
            currencyInKZT += money;

            balance -= money;
            balance -= transferFee;
            System.out.println(owner + "/" + nameCurrency + "счет пополнен на " + money / rate + " " + nameCurrency + "." + " Баланс счета " + ": " + currencyInKZT / rate + " " + nameCurrency + " (" + (currencyInKZT) + " тенге)");
            System.out.println("Комиссия за перевод: -" + transferFee);
            System.out.println("Баланс основного счета " + balance);
            System.out.println();

        } else {
            System.out.println("Недостаточно средств");
        }


    }

    /////////////////------ТРАНСФЕР USD-------///////////////////
    void rateUSDMethod(double money) {
        if ((money + transferFee) < balance) {
            balanceUSDinKZT += money;
//            balanceUSDinUSD += money / rateUSD;
            balance -= money;
            balance -= transferFee;
            System.out.println(owner + "/ USD счет пополнен на " + money / rateUSD + " USD." + " Баланс USD счета: " + balanceUSDinKZT / rateUSD + " (" + balanceUSDinKZT + " тенге)");
            System.out.println("Комиссия за перевод: -" + transferFee);
            System.out.println("Баланс основного счета " + balance);
            System.out.println();
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    /////////////////------ТРАНСФЕР EUR-------///////////////////
    void rateEURMethod(double money) {
        if ((money + transferFee) < balance) {
            balanceEUR += money / rateEUR;
            balance -= money;
            balance -= transferFee;
            System.out.println(owner + "/ EUR счет пополнен на " + money / rateEUR + " EUR." + " Баланс EUR счета: " + balanceEUR);
            System.out.println("Комиссия за перевод: -" + transferFee);
            System.out.println("Баланс основного счета " + balance);
            System.out.println();
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    /////////////////------ТРАНСФЕР RUB-------///////////////////
    void rateRUBMethod(double money) {
        if ((money + transferFee) < balance) {
            balanceRUB += money / rateRUB;
            balance -= money;
            balance -= transferFee;
            System.out.println(owner + "/ RUB счет пополнен на " + money / rateRUB + " RUB." + " Баланс RUB счета: " + balanceRUB);
            System.out.println("Комиссия за перевод: -" + transferFee);
            System.out.println("Баланс основного счета " + balance);
            System.out.println();
        } else {
            System.out.println("Недостаточно средств");
        }
    }


    /////////////////------СУММА ПОТРАЧЕННЫХ ДЕНЕГ-------///////////////////
    void spentMoneyMethod() {
        System.out.println(owner + "/ Сумма потраченных денег: " + spentMoney);
    }

    ////////////////////------ИСТОРИЯ ПОКУПОК-------///////////////////////
    void history() {
        System.out.println(owner + "/ История покупок: " + history);
    }

    ////////////////////------ОПЛАТА ЗА ТОВАР-------///////////////////////
    void buy(Product product, double currency, double rate, String nameCurrency) {
        if (accountIsBlocked == false) {
            if ((currency >= product.price)) {//если баланс больше запрашиваемой суммы(money)то производим списывание
                if (product.price <= spendingLimit) {
                    currency -= product.price;

                    System.out.println(owner + "/ Оплачено за " + product.name + " - " + product.price + " тенге");
                    System.out.println(owner + "/ Баланс после покупки: " + currency/rate+ " "+ nameCurrency);
                    System.out.println();
                    history = history + " + " + product.name + "(" + product.price + ") ";
                    spentMoney = spentMoney + product.price;
                } else {
                    System.out.println("Сумма больше лимита");
                }
            } else {
                System.out.println("Недостаточно средств");
            }
        } else {
            System.out.println("Аккаунт заблокирован!");
        }
    }

    ////////////////////------ОПЛАТА-------///////////////////////
//        void pay ( double money){
//            if (balance >= money) {//если баланс больше запрашиваемой суммы(money)то производим списывание
//                balance -= money;
//            } else {
//                System.out.println("Недостаточно средств");
//            }
//        }

    ////////////////////------ ПЕРЕВОД -----////////////////////
    void transfer(Account otherAccount, double money) {//тип Аккаунт "Другой" и сумма перевода
        if (accountIsBlocked == false) {
            if (balance >= money) {//если баланс больше запрашиваемой суммы(money)то производим списывание
                otherAccount.balance += money;//к Другому Аккаунту прибавляем сумму(money)
                balance -= money;//из Баланса этого аккаунта отнимаем сумму (money)
            } else {
                System.out.println("Недостаточно средств");
            }
        } else {
            System.out.println("Аккаунт заблокирован!");
        }
    }

    ////////////////////------ПОПОЛНЕНИЕ-----///////////////////
    void addMoney(double money) {
        if (money >= minimumAddAmount) { //Если сумма пополнения больше минимальной суммы пополнения
            balance += money;//Прибавляем к балансу сумму пополнения
            System.out.println(owner + "/ Пополнение " + money);
        } else {
            System.out.println("Минимальная сумма пополнения: " + minimumAddAmount);
        }
    }
    ///////////////////------ВЫВОД ИНФО-----////////////////////

    void display() {
        System.out.println("Владелец: " + owner);
        System.out.println("Баланс KZT: " + balance);
        System.out.println("Баланс USD: " + balanceUSDinKZT/rateUSD + " (" + balanceUSDinKZT + " тенге)");
        System.out.println("Баланс EUR: " + balanceEUR + " (" + balanceEUR * rateEUR + " тенге)");
        System.out.println("Баланс RUB: " + balanceRUB + " (" + balanceRUB * rateRUB + " тенге)");
        System.out.println("История покупок: " + history);
        System.out.println("Сумма потраченных денег: " + spentMoney);
        System.out.println();
    }
}

