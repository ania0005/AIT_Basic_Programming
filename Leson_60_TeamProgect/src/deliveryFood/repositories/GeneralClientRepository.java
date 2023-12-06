package deliveryFood.repositories;

import deliveryFood.domain.GeneralClient;
import deliveryFood.domain.GeneralDish;
import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;
import deliveryFood.repositories.interfaces.ClientRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralClientRepository implements ClientRepository{
    private Map<Integer, Client> clients = new HashMap<>();
    private int currentId;


    public GeneralClientRepository() {
        addClient("Ivanov");
        addClient("Petrov");
        addClient("Smirnov");
        addClient("Zuev");

    }

    @Override
    public List<Client> getAllClients() {
        return new ArrayList<>(clients.values());
    }

    @Override
    public void addClient(String name) {
        GeneralClient client = new GeneralClient(name);
        client.setClientId(++currentId);
        clients.put(currentId, client);
    }

    @Override
    public Client getClientById(int id) {
            return clients.get(id);
    }

    @Override
    public Client getClientByName(String name) {
        return clients.get(name);
    }

    @Override
    public void setClientById(Client client, int id) {
        clients.put(id, client);
    }

}
