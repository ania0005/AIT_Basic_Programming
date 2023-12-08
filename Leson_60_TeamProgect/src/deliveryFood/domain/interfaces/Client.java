package deliveryFood.domain.interfaces;


import deliveryFood.domain.GeneralOrder;

import java.util.List;

public interface Client {
    int getClientId();
    boolean isAvailable();
    String getClientByName();
    List<Order> getOrders();
    void setAvailable(boolean available);
    void setName(String name);
    void setAdress(String adress);

    void addOrder(GeneralOrder order);

}
