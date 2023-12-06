package deliveryFood.service.interfaces;

import deliveryFood.domain.interfaces.Dish;

import java.util.List;

public interface DishService {
    void addDish(String name, double price);
    List<Dish> getAllAvailableDishes();
    void deleteDishById(int id);
    void deleteDishByName(String name);
    Dish  changePrice(int id, double newPrice);
    void restoreDishById(int id);
    void restoreDishByName(String name);
    int totalDishes();
    Dish  changeName(int id, String newName);




}
