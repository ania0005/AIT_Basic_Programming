package deliveryFood.domain.interfaces;

import shop.domain.interfases.Product;

import java.util.List;

public interface Order {
    int getId();
    List<Dish> getDishes();
    boolean addDish(Dish dish);
    boolean deleteDishById(int id);
    void clear();
    double getTotalPrice();
    double getAveragePrice();

}
