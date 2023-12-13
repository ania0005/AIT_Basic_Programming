package deliveryFood.application;

import deliveryFood.controllers.ClientController;
import deliveryFood.controllers.DishController;
import deliveryFood.controllers.MainController;
import deliveryFood.controllers.OrderController;
import deliveryFood.repositories.GeneralClientRepository;
import deliveryFood.repositories.GeneralDishRepository;
import deliveryFood.repositories.interfaces.ClientRepository;
import deliveryFood.repositories.interfaces.DishRepository;
import deliveryFood.service.GeneralClientService;
import deliveryFood.service.GeneralDishService;
import deliveryFood.service.interfaces.ClientService;
import deliveryFood.service.interfaces.DishService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        DishRepository dishRepository = new GeneralDishRepository();
        DishService dishService = new GeneralDishService(dishRepository);
        DishController dishController = new DishController(dishService);
        ClientRepository clientRepository = new GeneralClientRepository();
        ClientService clientService = new GeneralClientService(clientRepository);
        ClientController clientController = new ClientController(clientService);
        OrderController orderController = new OrderController(clientService, dishService);
        MainController mainController = new MainController(dishController, clientController, orderController);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                System.out.println("""
                        Choose an object:
                        1. Dish.\s
                        2. Client.\s
                        3. Order.\s
                        0. Output.""");
                int objectNum = Integer.parseInt(scanner.nextLine());

                switch (objectNum) {
                    case 1:
                        System.out.println("""
                                Choose an operation:
                                1. Save new dish\s
                                2. Get list all dishes\s
                                3. Get list all available dishes\s
                                4. Delete dish by id\s
                                5. Delete dish by name\s
                                6. Restore dish by id\s
                                7. Restore dish by name\s
                                8. Change name\s
                                9. Change price\s
                                10. Get total dishes quantity\s
                                """);

                        int operationNum = Integer.parseInt(scanner.nextLine());

                        mainController.sendReduest(objectNum + " " + operationNum)
                                .forEach(System.out::println);

                        break;

                    case 2:
                        System.out.println("""
                                Choose an operation:
                                1. Save new client\s
                                2. Get list all clients\s
                                3. Get list all available clients\s
                                4. Get list all orders by client\s
                                5. Delete client by id\s
                                6. Delete client by name\s
                                7. Restore client by id\s
                                8. Restore client by name\s
                                9. Change clients name\s
                                10. Change clients adress\s
                                11. Get total clients quantity\s
                                12. Get total orders quantity\s
                                13. Get total orders by client\s
                                14. Get list all vip clients\s
                                15. Get total vip clients\s
                                """);

                        int operationNum1 = Integer.parseInt(scanner.nextLine());

                        mainController.sendReduest(objectNum + " " + operationNum1)
                                .forEach(System.out::println);
                        break;
                    case 3:
                        System.out.println("""
                                Choose an operation:
                                1. Create new order\s
                                2. Delete dish from order\s
                                3. View order\s
                                """);


                        int operationNum2 = Integer.parseInt(scanner.nextLine());

                        mainController.sendReduest(objectNum + " " + operationNum2)
                                .forEach(System.out::println);
                        System.out.println();

                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Incorrect input");
                        break;
                }

                    } catch (Exception e) {
                    System.out.println("Error!!! " + e.getMessage());

                }
        }
    }
}