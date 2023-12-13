package deliveryFood.controllers;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    private DishController dishController;
    private ClientController clientController;
    private OrderController orderController;

    public MainController(DishController dishController, ClientController clientController, OrderController orderController) {
        this.dishController = dishController;
        this.clientController = clientController;
        this.orderController = orderController;
    }

    public List<Object> sendReduest(String query) {

            String[] parts = query.split(" ");
            int objectNum = Integer.parseInt(parts[0]);
            int operationNum = Integer.parseInt(parts[1]);

            List<Object> result = new ArrayList<>();


            switch (objectNum) {
                case 1:
                    //ветка для работы с блююдом
                    //вызываем контроллер блююд
                    switch (operationNum) {
                        case 1:
                            dishController.addDish();
                            return result;

                        case 2:
                            result.addAll(dishController.getAllDishes());
                            return result;

                        case 3:
                            result.addAll(dishController.getAllAvailableDishes());
                            return result;

                        case 4:
                            dishController.deleteDishById();
                            return result;

                        case 5:
                            dishController.deleteDishByName();
                            return result;

                        case 6:
                            dishController.restoreDishById();
                            return result;

                        case 7:
                            dishController.restoreDishByName();
                            return result;

                        case 8:
                            dishController.changeName();
                            return result;

                        case 9:
                            dishController.changePrice();
                            return result;

                        case 10:
                            int result1 = 0;
                            result1 = dishController.totalDishesQuantity();
                            result.add(result1);
                            return result;
                        default:
                            System.out.println("Invalid input!");
                            break;
                    }

                case 2: //ветка для работы с покупателем
                    //вызываем контроллер покупателя
                    switch (operationNum) {
                        case 1:
                            clientController.addClient();
                            return result;

                        case 2:
                            result.addAll(clientController.getAllClient());
                            return result;

                        case 3:
                            result.addAll(clientController.getAllAvailableClient());
                            return result;

                        case 4:
                            result.addAll(clientController.getAllOrdersByClientId());
                            return result;

                        case 5:
                            clientController.deleteClientById();
                            return result;

                        case 6:
                            clientController.deleteClientByName();
                            return result;

                        case 7:
                            clientController.restoreClientById();
                            return result;

                        case 8:
                            clientController.restoreClientByName();
                            return result;

                        case 9:
                            clientController.changeName();
                            return result;

                        case 10:
                            clientController.changeAdress();
                            return result;

                        case 11:
                            int result1;
                            result1 = clientController.totalClientsQuantity();
                            result.add(result1);
                            return result;

                        case 12:
                            int result2;
                            result2 = clientController.totalOrderQuantity();
                            result.add(result2);
                            return result;

                        case 13:
                            int result3;
                            result3 = clientController.orderQuantityByClient();
                            result.add(result3);
                            return result;

                        case 14:
                            result.addAll(clientController.getAllVipClient());
                            return result;
                        case 15:
                            int result4;
                            result4 = clientController.totalVipClientsQuantity();
                            result.add(result4);
                            return result;
                        default:
                            System.out.println("Invalid input!");
                            break;
                    }

                case 3:
                    switch (operationNum) {
                        case 1:
                            orderController.addOrder();
                            return result;

                        case 2:
                            orderController.deleteOrderById();
                            return result;

                        case 3:
                            orderController.viewOrder();
                            return result;
                        default:
                            System.out.println("Invalid input!");
                            break;
                    }
                    break;
            }
        return result;

    }
}








