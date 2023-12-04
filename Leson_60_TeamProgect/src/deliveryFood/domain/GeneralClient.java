package deliveryFood.domain;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;

import java.util.Date;

public class GeneralClient implements Client {
    private int id;
    private boolean available;
    private String name;
    private Order order;

    public GeneralClient(String name, Order order) {
        this.name = name;
        this.order = order;
        this.available = true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean available() {
        return available;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
