package shop.servises;

import shop.domain.interfases.Product;

import java.util.List;

public interface ProductServis {
    void addProduct(String name, double price);
    List<Product> getAllActivProducts();

}
