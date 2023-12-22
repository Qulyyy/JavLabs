package lab24;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws OrderAlreadyException, AddresOlreadyException {
        ArrayList<String> dish = new ArrayList<>();
        dish.add("pizza: Peperoni: 390");
        dish.add("cake: Sweet: 340");
        ArrayList<String> drink = new ArrayList<>();
        drink.add("water: Fresh, Bubbles: 239");
        drink.add("juice: Orange, Apple: 200");
        System.out.println("Menu: ");
        for (String s: dish)
            System.out.println(s);
        for (String s: drink)
            System.out.println(s);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addPosition(new Dish("pizza", "Peperoni", 590));
        //restaurantOrder.addPosition(new Drink("Juice", "Orange", -190));
        restaurantOrder.addPosition(new Drink("Juice", "Orange", 190));
        System.out.println("\npositions in the order: " + restaurantOrder.count());
        System.out.println(Arrays.toString(restaurantOrder.getDishes()));
        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        restaurantOrder1.addPosition(new Dish("cake", "Sweet", 700));
        restaurantOrder1.addPosition(new Drink("water", "Fresh, Bubbles", 160));
        System.out.println("Positions in the order: " + restaurantOrder1.count());
        System.out.println(Arrays.toString(restaurantOrder1.getDishes()));

        System.out.println("\n" + "Restaurant orders: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 1);
        orderManager.add(restaurantOrder1, 1);
        orderManager.add(restaurantOrder1, 2);
        System.out.println(orderManager.orders());

        InternetOrder internetOrder1 = new InternetOrder();
        internetOrder1.addPosition(new Dish("cake", "Sweet", 700));
        internetOrder1.addPosition(new Drink("water", "Fresh, Bubbles", 160));

        InternetOrder internetOrder2 = new InternetOrder();
        internetOrder2.addPosition(new Dish("cake", "Sweet", 700));
        internetOrder2.addPosition(new Drink("water", "Fresh, Bubbles", 100));

        System.out.println("internet order: ");
        orderManager.add(internetOrder1, "test address 1233");
        orderManager.add(internetOrder2, "test address 1233");
        System.out.println(orderManager.getInternetOrder());

        System.out.println("\n" + "Restaurant orders: ");
        orderManager.removeOrder(2);
        System.out.println(orderManager.orders());

    }
}
