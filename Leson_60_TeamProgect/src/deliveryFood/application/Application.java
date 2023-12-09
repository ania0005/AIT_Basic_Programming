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
            System.out.println("Choose an object:\n" +
                    "1. Dish. \n" +
                    "2. Client. \n" +
                    "3. Order. \n" +
                    "0. Output.");
            int objectNum = Integer.parseInt(scanner.nextLine());

            switch (objectNum) {
                case 1:
                    System.out.println("Choose an operation:\n" +
                            "1. Save new dish \n" +
                            "2. Get list all dishes \n" +
                            "3. Get list all available dishes \n" +
                            "4. Delete dish by id \n" +
                            "5. Delete dish by name \n" +
                            "6. Restore dish by id \n" +
                            "7. Restore dish by name \n" +
                            "8. Change name \n" +
                            "9. Change price \n" +
                            "10. Get total dishes quantity \n");

                    int operationNum = Integer.parseInt(scanner.nextLine());

                    mainController.sendReduest(objectNum + " " + operationNum)
                            .forEach(System.out :: println);

                    break;

                case 2:
                    System.out.println("Choose an operation:\n" +
                            "1. Save new client \n" +
                            "2. Get list all clients \n" +
                            "3. Get list all available clients \n" +
                            "4. Get list all orders by client \n" +
                            "5. Delete client by id \n" +
                            "6. Delete client by name \n" +
                            "7. Restore client by id \n" +
                            "8. Restore client by name \n" +
                            "9. Change clients name \n" +
                            "10. Change clients adress \n" +
                            "11. Get total clients quantity \n" +
                            "12. Get total orders quantity \n" +
                            "13. Get total orders by client \n");
                    int operationNum1 = Integer.parseInt(scanner.nextLine());

                    mainController.sendReduest(objectNum + " " + operationNum1)
                            .forEach(System.out :: println);
                    break;
                case 3:
                    System.out.println("Choose an operation:\n" +
                            "1. Create new order \n" +
                            "2. Delete dish from order \n"+
                            "3. View order \n");


                    int operationNum2 = Integer.parseInt(scanner.nextLine());

                    mainController.sendReduest(objectNum + " " + operationNum2)
                            .forEach(System.out :: println);

                    break;

                case 0:
                    return;
                default:
                    System.out.println("Incorrect input");
                    break;
            }
        }
    }
}
