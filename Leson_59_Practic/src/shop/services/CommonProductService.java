package shop.services;

import shop.domain.interfases.Product;
import shop.repositories.interfaces.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CommonProductService implements ProductService {
    private ProductRepository repository;

    public CommonProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addProduct(String name, double price) {
        if(name ==null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if(price <= 0) {
            throw new IllegalArgumentException("Price cannot be null or minus");
        }
        repository.addProduct(name, price);
    }

    @Override
    public List<Product> getAllActivProducts() {
        return repository.getAllProducts().stream()
                .filter(x -> x.isActiv())
                .collect(Collectors.toList());
    }
}
