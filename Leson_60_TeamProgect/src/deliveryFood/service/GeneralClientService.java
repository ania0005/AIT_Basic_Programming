package deliveryFood.service;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.repositories.interfaces.ClientRepository;
import deliveryFood.service.interfaces.ClientService;

import java.util.List;

public class GeneralClientService implements ClientService {
    private ClientRepository repository;
    @Override
    public void addClient(String name) {
       if(name ==null || name.isEmpty()){
                throw new IllegalArgumentException("Name cannot be empty");
            }
            repository.addClient(name);
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
    public int totalClients() {
        return repository.getAllClients().size();          //????
    }
}
