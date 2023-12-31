package deliveryFood.service;

import deliveryFood.domain.interfaces.Dish;
import deliveryFood.repositories.interfaces.DishRepository;
import deliveryFood.service.interfaces.DishService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GeneralDishService implements DishService {

    private DishRepository repository;

    public GeneralDishService(DishRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addDish(String name, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Наименование блюда не может быть пустым");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной и равняться нулю");
        }
        repository.addDish(name, price);
    }

    @Override
    public List<Dish> getAllAvailableDishes() {
        return repository.getAllDishes()
                .stream()
                .filter(x -> x.isAvailable())
                .collect(Collectors.toList());
    }

    @Override
    public void deleteDishById(int id) {
        Dish dish = repository.getDishById(id);
        if (dish != null) {
            dish.setAvailable(false);
        } else System.out.println("Dish by Id " + id + " not found");
    }

    @Override
    public void deleteDishByName(String name) {
        Dish dish = repository.getDishByName(name);
        if (dish != null) {
            dish.setAvailable(false);
        } else System.out.println("Dish by name " + name + " not found");
    }

    @Override
    public void restoreDishById(int id) {
        Dish dish = repository.getDishById(id);
        if (dish != null) {
            dish.setAvailable(true);
        } else System.out.println("Dish by Id " + id + " not found");
    }

    @Override
    public void restoreDishByName(String name) {
        Dish dish = repository.getDishByName(name);
        if (dish != null) {
            dish.setAvailable(true);
        } else System.out.println("Dish by name " + name + " not found");
    }

    @Override
    public void changePrice(int id, double newPrice) {
        Dish dish = repository.getDishById(id);
        if (dish != null) {
            dish.setPrice(newPrice);
        } else System.out.println("Dish by Id " + id + " not found");
    }

    @Override
    public void changeName(int id, String newName) {
        Dish dish = repository.getDishById(id);
        if (dish != null) {
            dish.setName(newName);
        } else System.out.println("Dish by Id " + id + " not found");
    }

    @Override
    public List<Dish> getAllDishes() {
        return repository.getAllDishes();
    }

    @Override
    public Dish getDishById(int id) {
        Dish dish = repository.getDishById(id);
        if (dish != null) {
        return repository.getDishById(id);
        } throw new IllegalArgumentException("Dish by Id " + id + " not found");
    }

    @Override
    public int totalDishesQuantity() {
        return repository.getAllDishes().size();
    }
}
