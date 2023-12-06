package deliveryFood.domain.interfaces;

public interface Dish {
    int getId();
    boolean isAvailable();
    String getName();
    double getPrice();
}
