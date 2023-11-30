package Product;

import Student.Student;

import java.util.Arrays;
import java.util.Comparator;

public class ProductApp {
    public static void main(String[] args) {

        Product[] products = {new Product(33, "Brod", 33),
        new Product(34, "Butter", 43),
            new Product(35, "Milk", 23),
                new Product(33, "Brod", 33),
                new Product(31, "Cake", 15)};

        Comparator<Product> productIdComparator = new ProductIdComparator();
        Arrays.sort(products, productIdComparator);

        System.out.println("Sort product Array by id:");
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i] + " ");
        }
        System.out.println();

        Comparator<Product> productPriceComparator = new ProductPriceComparator();
        Arrays.sort(products, productPriceComparator);

        System.out.println("Sort product Array by id:");
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i] + " ");
        }
        System.out.println();
    }
}


