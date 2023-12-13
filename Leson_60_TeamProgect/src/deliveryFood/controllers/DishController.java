package deliveryFood.controllers;

import deliveryFood.domain.interfaces.Dish;
import deliveryFood.service.interfaces.DishService;

import java.util.List;
import java.util.Scanner;

public class DishController {
    private DishService service;

    public DishController(DishService service) {
        this.service = service;
    }

    public void addDish() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input dish name:");
            String name = scanner.nextLine();

            System.out.println("Input dish price:");
            double price = Double.parseDouble(scanner.nextLine());
            service.addDish(name, price);

        } catch (Exception e) {
            throw new RuntimeException("Enter correct details");

        }
    }

    public List<Dish> getAllDishes() {
        return service.getAllDishes();
    }

    public List<Dish> getAllAvailableDishes() {
        return service.getAllAvailableDishes();
    }

    public void deleteDishById() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input dish id:");
            int dishId = Integer.parseInt(scanner.nextLine());
            service.deleteDishById(dishId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteDishByName() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input dish name:");
            String dishName = scanner.nextLine();
            service.deleteDishByName(dishName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void changePrice() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input dish id:");
            int dishId = Integer.parseInt(scanner.nextLine());

            System.out.println("Input dish  new price:");
            double price = Double.parseDouble(scanner.nextLine());
            service.changePrice(dishId, price);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void restoreDishById() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input dish id:");
            int dishId = Integer.parseInt(scanner.nextLine());
            service.restoreDishById(dishId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void restoreDishByName() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input dish name:");
            String dishName = scanner.nextLine();
            service.restoreDishByName(dishName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int totalDishesQuantity() {
        return service.totalDishesQuantity();
    }

    public void changeName() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input dish id:");
            int dishId = Integer.parseInt(scanner.nextLine());

            System.out.println("Input dish  new name:");
            String dishName = scanner.nextLine();
            service.changeName(dishId, dishName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

