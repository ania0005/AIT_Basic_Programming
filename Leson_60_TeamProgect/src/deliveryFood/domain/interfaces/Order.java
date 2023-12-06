package deliveryFood.domain.interfaces;

import java.time.LocalDateTime;
import java.util.List;

public interface Order {
    int getId();
    int getClientId();
    List<Dish> getDishes();
    boolean addDish(Dish dish);
    boolean deleteDishById(int id);
    void clear();
    double getTotalPrice();
    double getAveragePrice();
    LocalDateTime getDateTime();

}
