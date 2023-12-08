package deliveryFood.domain.interfaces;

import java.time.LocalDateTime;
import java.util.List;

public interface Order {
    int getOrderId();
    int getClientId();
    List<Dish> getDishesInOrder();
    boolean addDishToOrder(Dish dish);
    boolean deleteDishById(int id);
    void clear();
    double getTotalPrice();
    double getAveragePrice();
    LocalDateTime getDateTime();

}
