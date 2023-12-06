package deliveryFood.domain.interfaces;


import java.util.List;

public interface Client {
    int getClientId();
    boolean isAvailable();
    String getName();
    List<Order> getOrders();
    void setAvailable(boolean available);
    void setName(String name);

}
