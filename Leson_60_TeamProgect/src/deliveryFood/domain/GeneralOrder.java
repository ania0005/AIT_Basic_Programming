package deliveryFood.domain;

import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class GeneralOrder implements Order {

    private int id;
    private List<Dish> dishes = new ArrayList<>();

    @Override
    public int getId() {
        return id;
    }

    @Override
    public List<Dish> getDishes() {
        return dishes;
    }

    @Override
    public boolean addDish(Dish dish) {
        return dishes.add(dish);
    }

    @Override
    public boolean deleteDishById(int id) {
        Iterator<Dish> iterator = dishes.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getId() == id){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getAveragePrice() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralOrder that = (GeneralOrder) o;
        return id == that.id && Objects.equals(dishes, that.dishes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dishes);
    }

    @Override
    public String toString() {
        return dishes.toString();
    }
}
