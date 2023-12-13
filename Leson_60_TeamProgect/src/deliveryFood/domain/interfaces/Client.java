package deliveryFood.domain.interfaces;


import deliveryFood.domain.GeneralOrder;

import java.util.List;

public interface Client {
    boolean isVip();

    int getClientId();

    boolean isAvailable();

    String getClientByName();

    List<Order> getOrders();

    void setAvailable(boolean available);

    void setName(String name);

    void setAdress(String adress);

    List<Dish> makeOrder();

    void addDishToOrder(Dish dish);

    Order getCurrentOrder();

    void setClientId(int clientId);
}
