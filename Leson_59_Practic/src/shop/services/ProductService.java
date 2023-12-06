package shop.services;

import shop.domain.interfases.Product;

import java.util.List;

public interface ProductService {
    void addProduct(String name, double price);
    List<Product> getAllActivProducts();

}
