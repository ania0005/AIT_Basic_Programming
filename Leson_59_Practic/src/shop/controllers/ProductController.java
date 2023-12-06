package shop.controllers;

import shop.domain.interfases.Product;
import shop.services.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }
    public void addProduct() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input name product:");
            String name = scanner.nextLine();

            System.out.println("Input price product:");
            double price = Double.parseDouble(scanner.nextLine());

            service.addProduct(name, price);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAllProduct() {
        return service.getAllActivProducts();
    }
}
