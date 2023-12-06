package deliveryFood.service.interfaces;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;

import java.util.List;

public interface ClientService {


    void addClient(String name);
    List<Client> getAllAvailableClient();
    void deleteClientById(int id);
    void deleteClientByName(String name);
    void changeName(int id, String newName);
    void restoreClientById(int id);
    void restoreClientByName(String name);
    int totalClients();



}
