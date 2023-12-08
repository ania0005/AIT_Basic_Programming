package deliveryFood.repositories.interfaces;
import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;
import java.util.List;

public interface ClientRepository {
    List<Client> getAllClients();
    void addClient(String name, String adress);
    Client getClientById(int clientId);
    Client getClientByName(String name);
    void setClientById(Client client, int clientId);

}
