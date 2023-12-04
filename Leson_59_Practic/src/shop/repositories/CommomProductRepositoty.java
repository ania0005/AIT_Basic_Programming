package shop.repositories;

import shop.domain.CommonProduct;
import shop.domain.interfases.Product;
import shop.repositories.interfaces.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommomProductRepositoty implements ProductRepository {
    private Map<Integer, Product> products = new HashMap<>();
    private int currentId;

    public CommomProductRepositoty(){
        addProduct("Banane", 150);
        addProduct("Apple", 90);
        addProduct("Orange", 190);
    }

    public List<Product> getAllProducts(){
        return new ArrayList<>(products.values());
    }

    @Override
    public void addProduct(String name, double price) {
        CommonProduct product = new CommonProduct(name, price);
        product.setId(++currentId);
        products.put(currentId, product);

    }

}
