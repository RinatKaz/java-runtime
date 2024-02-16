package Home7lessons;

public class CostOfOrderingInARestourant {
    public static void main(String[] args) {
        MethodManager manager = new MethodManager();
        double total = manager.orderCost("Главное блюдо", 5);
        System.out.println(total);
    }
}
//        static double orderCost (String dishType,int quantity){
//
//            switch (dishType) {
//                case "Суп":
//                    return 3000 * quantity;
//                case "Главное блюдо":
//                    return 5000 * quantity;
//                case "Десерт":
//                    return 2000 * quantity;
//                default:
//                    return -1;
//            }
//        }

