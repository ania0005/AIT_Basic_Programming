package shop.domain.interfases;

import java.util.List;

public interface Cart {
    int getId();
    List<Product> getProducts();
    boolean addProduct(Product product);
    boolean deleteProductById(int id);
    void clear();
    double getTotalPrice();
    double getAveragePrice();

}
