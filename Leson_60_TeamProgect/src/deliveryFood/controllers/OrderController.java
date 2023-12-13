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
    double cost = 0;

    public OrderController(ClientService serviceClient, DishService serviceDish) {
        this.serviceClient = serviceClient;
        this.serviceDish = serviceDish;
    }

    public void addOrder() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter client name:");
            String name = scanner.nextLine();

            Client client = serviceClient.getClientByName(name);

            if (client == null) {
                System.out.println("Input client adress:");
                String adress = scanner.nextLine();
                serviceClient.addClient(name, adress);

                client = serviceClient.getClientByName(name);
            }
            if (!client.isAvailable()) {
                client.setAvailable(true);
            }
            while (true) {
                List<Dish> availableDishes = serviceDish.getAllAvailableDishes();
                System.out.println("Choose dish:");
                availableDishes.forEach(System.out::println);
                System.out.println("Type 0 to exit and show order cost");

                int dishId = Integer.parseInt(scanner.nextLine());

                if (dishId != 0) {
                    int dishAmount;
                    System.out.println("Type dish amount:");
                    dishAmount = Integer.parseInt(scanner.nextLine());

                    while (dishAmount >= 1) {
                        client.addDishToOrder(serviceDish.getDishById(dishId));
                        --dishAmount;
                    }

                } else {

                    cost = client.getCurrentOrder().getTotalPrice();
                    System.out.printf(client.getCurrentOrder() + "\n");
                    if(client.isVip()){
                        cost = cost * 0.8;
                        System.out.printf("Congratulation! You have discount 20%%\n" +
                                "Total amount %.2f",cost);
                        System.out.println();
                    }
                    break;
                }
            }
            serviceClient.makeOrder(client.getClientId());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void deleteOrderById() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the client ID:");
            int clientId = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter № position of order:");
            int position = Integer.parseInt(scanner.nextLine());
            serviceClient.deleteDishFromLastOrderByPosition(clientId, position);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void viewOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the client ID:");
        int clientId = Integer.parseInt(scanner.nextLine());
        Order lastOrder = serviceClient.getLastOrder(clientId);
        System.out.println(lastOrder);
    }

}
