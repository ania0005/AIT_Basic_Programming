package shop.aplication;

import shop.controllers.MainController;
import shop.controllers.ProductController;
import shop.repositories.CommomProductRepository;
import shop.repositories.interfaces.ProductRepository;
import shop.services.CommonProductService;
import shop.services.ProductService;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        ProductRepository repository = new CommomProductRepository();
        ProductService service = new CommonProductService(repository);
        ProductController productController = new ProductController(service);
        MainController mainController = new MainController(productController);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an object:\n" +
                    "1. Product. \n" +
                    "2. Castomer. \n" +
                    "0. Output.");
            int objectNum = Integer.parseInt(scanner.nextLine());

            switch (objectNum) {
                case 1:
                    System.out.println("Choose an operation:\n" +
                            "1. Сохранение нового продукта\n" +
                            "2. Получение списка всех продуктов");

                    int operationNum = Integer.parseInt(scanner.nextLine());

                   mainController.sendReduest(objectNum + " " + operationNum)
                           .forEach(System.out :: println);
                    break;

                case 2: //ветка для работы с покупателем
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Incorrect input");
                    break;
            }
        }
    }
}
