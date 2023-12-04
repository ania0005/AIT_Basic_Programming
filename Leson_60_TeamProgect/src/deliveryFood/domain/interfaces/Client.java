package deliveryFood.domain.interfaces;

public interface Client {
    int getId();
    boolean available();
    String getName();
    Order getOrder();

}
