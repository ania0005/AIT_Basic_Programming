package deliveryFood.controllers;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Order;
import deliveryFood.service.interfaces.ClientService;
import deliveryFood.service.interfaces.DishService;

import java.util.List;
import java.util.Scanner;

public class ClientController {
    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    void addClient() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input client name:");
            String name = scanner.nextLine();

            System.out.println("Input client adresse:");
            String adress = scanner.nextLine();

            service.addClient(name, adress);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Client> getAllVipClient() {
        return service.getAllVipClient();
    }

    public List<Client> getAllClient() {
        return service.getAllClients();
    }

    public List<Client> getAllAvailableClient() {
        return service.getAllAvailableClient();
    }

    public void deleteClientById() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());

            service.deleteClientById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteClientByName() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client name:");
            String name = scanner.nextLine();

            service.deleteClientByName(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void changeName() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Input client  new name:");
            String name = scanner.nextLine();

            service.changeName(id, name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void restoreClientById() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());

            service.restoreClientById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void restoreClientByName() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client name:");
            String name = scanner.nextLine();

            service.restoreClientByName(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public int totalClientsQuantity() {
        return service.totalClientsQuantity();
    }
    public int totalVipClientsQuantity() {
        return service.totalVipClientsQuantity();
    }

    public void changeAdress() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client name:");
            String name = scanner.nextLine();
            if(!(name instanceof String)){
                System.out.println("Input correct information. ");
                return;
            }
            System.out.println("Input new adress");
            String adress = scanner.nextLine();

            service.changeAdress(name, adress);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public List<Order> getAllOrdersByClientId() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());

            return service.getAllOrdersByClientId(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int totalOrderQuantity() {
        return service.totalOrderQuantity();
    }

    public int orderQuantityByClient() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input client id:");
            int id = Integer.parseInt(scanner.nextLine());

            return service.orderQuantityByClient(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
