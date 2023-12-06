package deliveryFood.repositories.interfaces;

import deliveryFood.domain.interfaces.Dish;

import java.util.List;

public interface DishRepository {
    List<Dish> getAllDishes();
    void addDish(String name, double price);
    Dish getDishById(int id);
    void setDishById(Dish dish, int id);


}
