package deliveryFood.service.interfaces;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;

import java.util.List;

public interface ClientService {

    void addClient(String name, String adress);

    List<Client> getAllAvailableClient();

    void deleteClientById(int id);

    void deleteClientByName(String name);

    void changeName(int id, String newName);

    void restoreClientById(int id);

    void restoreClientByName(String name);

    int totalClientsQuantity();

    void changeAdress(String name, String newAdress);

    List<Order> getAllOrdersByClientId(int id);

    int totalOrderQuantity();

    int orderQuantityByClient(int id);

    List<Client> getAllClients();

    Client getClientByName(String name);

    List<Dish> makeOrder(int id);

    List<Client> getAllVipClient();

    // void addDishToOrder(int clientId, int dishId);
    // List<Dish> getDishesFromLastOrder(int id);
    Order getLastOrder(int clientId);

    void deleteDishFromLastOrderByPosition(int clientId, int position);

    int totalVipClientsQuantity();
}
