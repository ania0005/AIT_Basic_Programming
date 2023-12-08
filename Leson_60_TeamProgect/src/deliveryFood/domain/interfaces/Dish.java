package deliveryFood.domain.interfaces;

import java.util.List;

public interface Dish {
    int getId();
    boolean isAvailable();
    String getName();
    double getPrice();
    void setAvailable(boolean available);
    void setPrice(double newPrice);
    void setName(String newName);
}
