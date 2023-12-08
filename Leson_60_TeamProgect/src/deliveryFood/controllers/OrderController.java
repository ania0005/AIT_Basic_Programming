package deliveryFood.controllers;

import deliveryFood.domain.GeneralOrder;
import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;
import deliveryFood.service.interfaces.ClientService;
import deliveryFood.service.interfaces.DishService;

import java.util.List;
import java.util.Scanner;

public class OrderController {
    private ClientService serviceClient;
    private DishService serviceDish;
    private Client client;
    GeneralOrder order = new GeneralOrder();
    double cost = 0;

    public OrderController(ClientService serviceClient, DishService serviceDish) {
        this.serviceClient = serviceClient;
        this.serviceDish = serviceDish;
    }

    public void addOrder() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client name:");
            String name = scanner.nextLine();

            client = serviceClient.getClientByName(name);

            if (client == null) {
                System.out.println("Input client adress:");
                String adress = scanner.nextLine();
                serviceClient.addClient(name, adress);

                client = serviceClient.getClientByName(name);

            while (true) {
                System.out.println("Choose dish:\n" +
                        "1. Kebab \n" +
                        "2. King Burger \n" +
                        "3. Hamburger \n" +
                        "4. Cheeseburger \n" +
                        "5. Chicken Roll \n" +
                        "5. French fries \n" +
                        "7. Hamburger menu \n" +
                        "8. Cheeseburger menu \n" +
                        "9. Cola \n" +
                        "10. Fanta \n" +
                        "11. Strit" +
                        "0. Exit and show order cost");

                int dishId = Integer.parseInt(scanner.nextLine());

                if (dishId != 0) {
                    int dishAmount;
                    System.out.println("Type dish amount:");
                    dishAmount = Integer.parseInt(scanner.nextLine());

                    while (dishAmount >= 1) {
                        order.addDishToOrder(serviceDish.getDishById(dishId));
                        --dishAmount;
                    }

                }else
                    cost = order.getTotalPrice();
                    System.out.printf("Your order: \n" + order + "\n Cost of your order: " + cost);

                    break;

                }
                client.addOrder(order);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



public void deleteDishFromOrder() {
    try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the dish to delete:");
        int dishId = Integer.parseInt(scanner.nextLine());
        order.deleteDishById(dishId);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
    public List<Dish> viewOrder() {
        return order.getDishesInOrder();
        }

}
