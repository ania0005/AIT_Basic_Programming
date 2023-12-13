package deliveryFood.domain;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GeneralClient implements Client {
    private int clientId;
    private boolean isAvailable;
    private String name;
    private String adress;
    private Order currentOrder;
    private List<Order> orders = new ArrayList<>();


    public GeneralClient(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.isAvailable = true;
        currentOrder = new GeneralOrder();
    }

    @Override
    public boolean isVip() {
        return orders.size() > 1;
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

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public List<Dish> makeOrder() {
        orders.add(currentOrder);
        List<Dish> dishes = currentOrder.getDishesInOrder();
        currentOrder = new GeneralOrder();
        return dishes;
    }

    @Override
    public void addDishToOrder(Dish dish) {
        currentOrder.addDishToOrder(dish);
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralClient client = (GeneralClient) o;
        return clientId == client.clientId && isAvailable == client.isAvailable && Objects.equals(name, client.name) && Objects.equals(adress, client.adress) && Objects.equals(currentOrder, client.currentOrder) && Objects.equals(orders, client.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, isAvailable, name, adress, currentOrder, orders);
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    @Override
    public String toString() {
        return String.format("id - %d, " +
                        "name - %s, adress - %s, available - %s.",
                clientId, name, adress, isAvailable ? "yes" : "no");

    }
}
