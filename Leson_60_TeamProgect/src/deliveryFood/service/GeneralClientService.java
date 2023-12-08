package deliveryFood.service;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Order;
import deliveryFood.repositories.interfaces.ClientRepository;
import deliveryFood.service.interfaces.ClientService;

import java.util.List;

public class GeneralClientService implements ClientService {
    private ClientRepository repository;

    public GeneralClientService(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addClient(String name, String adress) {
       if(name ==null || name.isEmpty()){
                throw new IllegalArgumentException("Name cannot be empty");
            }
            repository.addClient(name, adress);
    }

    @Override
    public List<Client> getAllAvailableClient() {
        return repository.getAllClients();
    }

    @Override
    public void deleteClientById(int id) {
        Client client = repository.getClientById(id);
        if(client != null){
           client.setAvailable(false);
        }
    }

    @Override
    public void deleteClientByName(String name) {
        Client client = repository.getClientByName(name);
        if(client != null){
            client.setAvailable(false);
        }
    }

    @Override
    public void changeName(int id, String newName) {
        Client client = repository.getClientById(id);
        if(client != null) {
            client.setName(newName);
        }
    }

    @Override
    public void restoreClientById(int id) {
        Client client = repository.getClientById(id);
        if(client != null){
            client.setAvailable(true);
        }
    }

    @Override
    public void restoreClientByName(String name) {
        Client client = repository.getClientByName(name);
        if(client != null){
            client.setAvailable(true);
        }
    }

    @Override
    public int totalClientsQuantity() {
        return repository.getAllClients().size();
    }

    @Override
    public void changeAdress(String name, String newAdress) {
        Client client = repository.getClientByName(name);
        if(client != null){
            client.setAdress(newAdress);
        }
    }

    @Override
    public List<Order> getAllOrdersByClientId(int id) {
        Client client = repository.getClientById(id);
        if (client != null) {
            return client.getOrders();
        }
        throw new IllegalArgumentException("Client by id not found");
    }

    @Override
    public int totalOrderQuantity() {
        return repository.getAllClients().stream()
                .mapToInt(x -> x.getOrders().size())
                .sum();
    }

    @Override
    public int orderQuantityByClient(int id) {
        return getAllOrdersByClientId(id).size();
    }

    @Override
    public List<Client> getAllClients() {
        return repository.getAllClients();
    }

    @Override
    public Client getClientByName(String name) {
        return repository.getClientByName(name);
    }

    public int totalClientQuantity() {
        return repository.getAllClients().size();
    }
}
