package deliveryFood.repositories.interfaces;

import deliveryFood.domain.interfaces.Dish;

import java.util.List;

public interface DishRepository {

    void addDish(String name, double price);
    List<Dish> getAllDishes();
    Dish getDishById(int id);
    void setDishById(Dish dish, int id);
    Dish getDishByName(String name);

}
