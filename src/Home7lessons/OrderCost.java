package Home7lessons;

public class OrderCost {
    double orderCost(String dishType, int quantity) {

        switch (dishType) {
            case "Суп":
                return 3000 * quantity;
            case "Главное блюдо":
                return 5000 * quantity;
            case "Десерт":
                return 2000 * quantity;
            default:
                return -1;
        }
    }
}
