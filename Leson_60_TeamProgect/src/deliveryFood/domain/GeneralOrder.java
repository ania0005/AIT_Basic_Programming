package deliveryFood.domain;

import deliveryFood.domain.interfaces.Client;
import deliveryFood.domain.interfaces.Dish;
import deliveryFood.domain.interfaces.Order;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.DoubleStream;

public class GeneralOrder implements Order {

    private int id;
    private int clientId;
    private LocalDateTime dateTime;
    private List<Dish> dishes = new ArrayList<>();

    public GeneralOrder() {
        dateTime = LocalDateTime.now();
    }

    @Override
    public int getOrderId() {
        return id;
    }

    @Override
    public int getClientId() {
        return clientId;
    }

    @Override
    public List<Dish> getDishesInOrder() {
        return dishes;
    }

    @Override
    public boolean addDishToOrder(Dish dish) {
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
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public void clear() {
        dishes.clear();
    }

    @Override
    public double getTotalPrice() {
        return dishes.stream()
                .map(Dish::getPrice)
                .reduce((x, y) -> x + y)
                .orElse(0.0);
    }

    @Override
    public double getAveragePrice() {
        double averagePrice = dishes.stream()
                .map(Dish::getPrice)
                .mapToDouble(x -> x)
                .average()
                .orElse(0);
        return averagePrice;
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
