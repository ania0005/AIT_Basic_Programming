package shop.repositories.iterfaces;

import shop.domain.interfases.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();
    void addProduct(String name, double price);


}
