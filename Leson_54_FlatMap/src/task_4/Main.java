package task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();

        products.add(new Product("Apple", 90));
        products.add(new Product("Banane", 150));
        products.add(new Product("Melon", 70));
        products.add(new Product("Orange", 210));
        products.add(new Product("Coconut", 300));
        products.add(new Product("Apple", 85));
        products.add(new Product("Banane", 120));
        products.add(new Product("Ice cream", 120));
        products.add(new Product("Orange", 65));
        products.add(new Product("Bread", 230));

        //Создать лист уникальных продуктов дороже 100

        List<String> result = products.stream() // стрим продуктов
                .filter(x -> x.getPrice() > 100) // стрим отфильтрованных продуктов
                .map(x -> x.getName()) // стрим стрингов (наименований)
                .distinct() // убираем дубликаты из стрима
                .collect(Collectors.toList()); // собираем стрим в лист
        System.out.println(result);

//        2 variant
//        List<String> result1 = new ArrayList<>(products.stream() // стрим продуктов который будем записывать в новый лист
//                .filter(x -> x.getPrice() > 100) // стрим отфильтрованных продуктов
//                .map(x -> x.getName()) // стрим стрингов (наименований)
//                .collect(Collectors.toSet())); // собираем стрим в лист
//        System.out.println(result1);
    }
}
