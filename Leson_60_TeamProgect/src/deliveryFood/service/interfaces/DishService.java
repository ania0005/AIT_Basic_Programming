package deliveryFood.service.interfaces;

import deliveryFood.domain.interfaces.Dish;

import java.util.List;

public interface DishService {
    void addDish(String name, double price);
    List<Dish> getAllAvailableDishes();
}
