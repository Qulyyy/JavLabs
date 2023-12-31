package lab23;
public class Main {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Паста", "Макароны с соусом", 500);
        Dish dish2 = new Dish("Салат", "Свежий овощной салат", 300);
        Drink drink1 = new Drink("Кола", "Газированный напиток", 69);
        Drink drink2 = new Drink("Чай", "Черный чай", 100);

        InternetOrder order1 = new InternetOrder();
        order1.addPosition(dish1);
        order1.addPosition(drink1);

        InternetOrder order2 = new InternetOrder();
        order2.addPosition(dish2);
        order2.addPosition(drink2);

        System.out.println("Заказ 1:");
        printOrder(order1);
        System.out.println("Общая стоимость заказа 1: " + order1.costAll());

        System.out.println("Заказ 2:");
        printOrder(order2);
        System.out.println("Общая стоимость заказа 2: " + order2.costAll());

        TablesOrderManager orderManager = new TablesOrderManager();

        orderManager.orders().put(1, order1);
        orderManager.orders().put(2, order2);

        System.out.println("Заказ для стола 1:");
        printOrder((InternetOrder) orderManager.getOrder(1));
        System.out.println("Заказ для стола 2:");
        printOrder((InternetOrder) orderManager.getOrder(2));
    }

    private static void printOrder(InternetOrder order) {
        String[] dishes = order.getDishes();
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }
}

