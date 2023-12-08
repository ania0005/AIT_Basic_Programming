package deliveryFood.domain;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;

import java.util.List;

public class GeneralClient implements Client {
    private int clientId;
    private boolean isAvailable;
    private String name;
    private String adress;
    private Order currentOrder;
    private List<Order> orders;



    public GeneralClient(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.isAvailable = true;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public int getClientId() {
        return clientId;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String getClientByName() {
        return name;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAdress(String adress) {this.adress = adress;}

    @Override
    public void addOrder(GeneralOrder order) {
        currentOrder = order;
        orders.add(currentOrder);
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    @Override
    public String toString() {
        return String.format("id - %d, " +
                        "name - %s, adress - %s, available - %s.",
                clientId , name, adress, isAvailable ? "yes" : "no");

    }
}
