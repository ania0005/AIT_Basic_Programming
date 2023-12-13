package deliveryFood.service;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;
import deliveryFood.repositories.interfaces.ClientRepository;
import deliveryFood.repositories.interfaces.DishRepository;
import deliveryFood.service.interfaces.ClientService;

import java.util.List;
import java.util.stream.Collectors;

public class GeneralClientService implements ClientService {
    private ClientRepository repository;

    public GeneralClientService(ClientRepository repository){
        this.repository = repository;
    }

    @Override
    public void addClient(String name, String adress) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (adress == null || adress.isEmpty()) {
            throw new IllegalArgumentException("Адрес не может быть пустым");
        }
        repository.addClient(name, adress);
    }
    @Override
    public List<Client> getAllVipClient() {

        List<Client> vip = repository.getAllClients()
                .stream()
                .filter(x -> x.isVip())
                .collect(Collectors.toList());
        if(vip.isEmpty()) {
            System.out.println("Vip clients are absent \n");
        }
        return vip;
    }
    @Override
    public List<Client> getAllAvailableClient() {
        return repository.getAllClients()
                .stream()
                .filter(x -> x.isAvailable())
                .collect(Collectors.toList());
    }

    @Override
    public void deleteClientById(int id) {
        Client client = repository.getClientById(id);
        if (client != null) {
            client.setAvailable(false);
        } else System.out.println("Client with id" + id + " not found");
    }

    @Override
    public void deleteClientByName(String name) {
        Client client = repository.getClientByName(name);
        if (client != null) {
            client.setAvailable(false);
        } else System.out.println("Client " + name + " not found");
    }

    public List<Dish> makeOrder(int id) {
       if(!repository.getClientById(id).isAvailable()){
           repository.getClientById(id).setAvailable(true);}
       return repository.getClientById(id).makeOrder();
    }

    @Override
    public void changeName(int id, String newName) {
        Client client = repository.getClientById(id);
        if (client != null) {
            client.setName(newName);
        } else System.out.println("Client with id" + id + " not found");
    }


    @Override
    public void restoreClientById(int id) {
        Client client = repository.getClientById(id);
        if (client != null) {
            client.setAvailable(true);
        } else System.out.println("Client with id" + id + " not found");
    }

    @Override
    public void restoreClientByName(String name) {
        Client client = repository.getClientByName(name);
        if (client != null) {
            client.setAvailable(true);
        } else System.out.println("Client " + name + " not found");
    }

    @Override
    public int totalClientsQuantity() {
        return repository.getAllClients().size();
    }
    @Override
    public int totalVipClientsQuantity() {
        return getAllVipClient().size();
    }

    @Override
    public void changeAdress(String name, String newAdress) {
        Client client = repository.getClientByName(name);
        if (client != null) {
            client.setAdress(newAdress);
        } else System.out.println("Client " + name + " not found");
    }

    @Override
    public List<Order> getAllOrdersByClientId(int id) {
        Client client = repository.getClientById(id);
        if (client != null) {
            return client.getOrders();
        }
        throw new IllegalArgumentException("Client by id not found");
    }

    public void deleteDishFromLastOrderByPosition(int clientId, int position) {
        Client client = repository.getClientById(clientId);
        if (position >= 0 && position <= repository.getClientById(clientId).getOrders().size() - 1) {
            if (client != null) {
                List<Order> orders = repository.getClientById(clientId).getOrders();
                orders.get(orders.size() - 1).getDishesInOrder().remove(position - 1);
            } else System.out.println("Client by Id" + clientId + " not found");
        } else System.out.println("Order does not contain position " + position);
    }

    @Override
    public int totalOrderQuantity() {
        return repository.getAllClients().stream()
                .mapToInt(x -> x.getOrders().size())
                .sum();
    }

    public Order getLastOrder(int clientId) {
        Client client = repository.getClientById(clientId);
        if (client != null) {
            List<Order> orders = repository.getClientById(clientId).getOrders();
            return orders.get(orders.size() - 1);
        } throw new IllegalArgumentException("Client by id" + clientId + " not found");
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
}

