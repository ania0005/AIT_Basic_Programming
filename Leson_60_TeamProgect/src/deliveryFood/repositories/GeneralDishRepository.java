package deliveryFood.repositories;

import deliveryFood.domain.GeneralDish;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.repositories.interfaces.DishRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralDishRepository implements DishRepository {
    private Map<Integer, Dish> dishes = new HashMap<>();
    private int currentId;
    public GeneralDishRepository(){
        addDish("Pizza", 40);
        addDish("Kebab", 35.5);
        addDish("King Burger", 38.40);
    }
    @Override
    public List<Dish> getAllDishes() {
        return new ArrayList<>(dishes.values());
    }

    @Override
    public void addDish(String name, double price) {
        GeneralDish dish = new GeneralDish(name, price);
        dish.setId(++currentId);
        dishes.put(currentId, dish);

    }
}
