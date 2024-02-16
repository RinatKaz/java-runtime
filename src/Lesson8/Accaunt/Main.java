package Lesson8.Accaunt;

public class Main {
    public static void main(String[] args) {
        Account denis = new Account();//создали новый объект Денис
        denis.owner = "Denis";//дали имя объекту (имя держателя карты)
        denis.history = "";//создали счетчик покупок
        denis.accountIsBlocked = false;
        denis.addMoney(10000);//Пополнили баланс Денису через метод Пополнение
//        denis.rateUSDMethod(457.08);
//        denis.display();
//        denis.rateEURMethod(498.18);


        Account mike = new Account();//Создали новый объект Майк
        mike.owner = "Mike";//дали имя объекту (имя держателя карты)

//        System.out.println("Баланс до перевода");
//        denis.display();// Методом Вывод Инфо показываем информацию Дениса
//        mike.display();//Методом Вывод Инфо показываем информацию Майка
//
//        denis.transfer(mike,1000);//Методом Перевод, Денису переводим от Майка сумму 500
//
//        System.out.println("Баланс после перевода");
//        denis.display();// Методом Вывод Инфо показываем информацию Дениса
//        mike.display();//Методом Вывод Инфо показываем информацию Майка
//
        Product bread = new Product();
        bread.name = "Хлеб";
        bread.price = 100;

//        denis.buy(product);//Методом "Оплата за товар" Денис покупает товар
//        System.out.println("Баланс после покупки");
//        denis.display();// Методом Вывод Инфо показываем информацию Дениса
//        denis.buy(product);//Методом "Оплата за товар" Денис покупает товар
//        denis.history();//Методом История(покупок) вызываем Историю покупок Дениса
//        denis.spentMoneyMethod();//Методом spentMoneyMethod показываем Сумму потраченных денег Дениса
//        denis.display();
//        denis.rateMethod(1457.08, denis.balanceUSDinKZT, denis.rateUSD, "USD");
//        denis.rateUSDMethod(457.08);
//        denis.rateUSDMethod(457.08);

        denis.display();
        denis.rateMethod(5000, denis.balanceUSDinKZT, denis.rateUSD, "USD");
        denis.display();



    }
}
