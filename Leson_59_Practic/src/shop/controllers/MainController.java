package shop.controllers;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    private ProductController productController;

    public MainController(ProductController productController) {
        this.productController = productController;
    }

    public List<Object> sendReduest(String query) {
        try {
            String[] parts = query.split(" ");
            int objectNum = Integer.parseInt(parts[0]);
            int operationNum = Integer.parseInt(parts[1]);

            List<Object> result = new ArrayList<>();

            switch (objectNum) {
                case 1://ветка для работы с продуктом
                    //вызываем контроллера продукта

                    switch (operationNum) {
                        case 1: //ветка для операции сохранения
                            productController.addProduct();
                            break;
                        case 2: //ветка для операции возврата всех продуктов из БД
                            result.addAll(productController.getAllProduct());
                            break;
                    }
                case 2: //ветка для работы с покупателем
                    //вызываем контроллер покупателя
                    break;
            }
                return result;
        } catch (Exception e) {
            System.out.println("There was an error in MainController");
            throw new RuntimeException(e);
        }
    }
}
