package deliveryFood.service;

import deliveryFood.domain.interfaces.Dish;
import deliveryFood.service.interfaces.DishService;

import java.util.List;

public class GeneralDishService implements DishService {
    @Override
    public void addDish(String name, double price) {
    }

    @Override
    public List<Dish> getAllAvailableDishes() {
        return null;
    }

    @Override
    public void deleteDishById(int id) {

    }

    @Override
    public void deleteDishByName(String name) {

    }

    public void deleteDish(int id) {
    }
    public Dish changePrice(int id, double newPrice){
        return null;
    }

    @Override
    public void restoreDishById(int id) {

    }

    @Override
    public void restoreDishByName(String name) {

    }

    @Override
    public int totalDishes() {
        return 0;
    }

    @Override
    public Dish changeName(int id, String newName) {
        return null;
    }

}
