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
    public List<Dish> getDishesInOrder() {
        return dishes;
    }

    @Override
    public boolean addDishToOrder(Dish dish) {
        return dishes.add(dish);
    }




    @Override
    public double getTotalPrice() {
        return dishes.stream()
                .map(Dish::getPrice)
                .reduce((x, y) -> x + y)
                .orElse(0.0);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralOrder that = (GeneralOrder) o;
        return id == that.id && clientId == that.clientId && Objects.equals(dateTime, that.dateTime) && Objects.equals(dishes, that.dishes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, dateTime, dishes);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Your order :\n").append(String.format("%tT\n", dateTime));
        for (int i = 0; i < dishes.size(); i++) {
            builder.append("N.").append(i + 1).append(" ").append(dishes.get(i).toStringOrder()).append("\n");
        }
        builder.append(String.format("Total amount: %.2f \n ",getTotalPrice()));
        return builder.toString();
    }
}
