package deliveryFood.domain;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;

import java.util.List;

public class GeneralClient implements Client {
    private int clientId;
    private boolean isAvailable;
    private String name;
    private List<Order> orders;


    public GeneralClient(String name) {
        this.name = name;
        this.isAvailable = true;
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
    public String getName() {
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
}
