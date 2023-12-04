package shop.domain;

import shop.domain.interfases.Cart;
import shop.domain.interfases.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CommanCart implements Cart {
    private int id;
    private List<Product> products = new ArrayList<>();

    @Override
    public int getId() {
        return id;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean addProduct(Product product) {
        return products.add(product);
    }

    @Override
    public boolean deleteProductById(int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getId() == id){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getAveragePrice() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommanCart that = (CommanCart) o;
        return id == that.id && Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
