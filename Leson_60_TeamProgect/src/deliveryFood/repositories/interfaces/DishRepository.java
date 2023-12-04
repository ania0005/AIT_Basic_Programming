package deliveryFood.repositories.interfaces;

import deliveryFood.domain.interfaces.Dish;

import java.util.List;

public interface DishRepository {
    List<Dish> getAllDishes();
    void addDish(String name, double price);

}
