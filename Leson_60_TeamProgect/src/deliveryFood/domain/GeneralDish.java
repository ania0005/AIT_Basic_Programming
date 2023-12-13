package deliveryFood.domain;

import deliveryFood.domain.interfaces.Dish;

import java.util.List;
import java.util.Objects;

public class GeneralDish implements Dish {
    private int id;
    private boolean isAvailable;
    private String name;
    private double price;

    public GeneralDish(String name, double price) {
        this.name = name;
        this.price = price;
        this.isAvailable = true;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    @Override
    public void setName(String newName) {
        name = newName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralDish that = (GeneralDish) o;
        return id == that.id && isAvailable == that.isAvailable && Double.compare(price, that.price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isAvailable, name, price);
    }

    @Override
    public String toString() {
        return String.format("%d. " +
                        " %s, price - %.2f, is active - %s.",
                id, name, price, isAvailable ? "yes" : "no");
    }
    @Override
    public String toStringOrder() {
        return String.format(" %s, price - %.2f",
                name, price);
    };

}
