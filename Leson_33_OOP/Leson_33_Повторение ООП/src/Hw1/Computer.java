package Hw1;

public class Computer  {
    //По методам - должны быть CRUD-операции: С - create, add R - read, find U - update (не обязательно)
    // D - delete, remove
    // Book - Library, найти несколько книг по автору
    //Computer (Laptop, SmartPhone) - Shop, найти компьютеры со скидкой на BlackFriday (отбор цене)
    //Product (Food, MeatFood, MilkFood) - Supermarket, искать продукты по сроку годности (алфавитный порядок)
    //Pets (Cat, Dog) - Hotel, стоимость пребывания, выручка от отеля, найти всех по породе
    //Student, Aspirant, Professor - High school
    //Во всех реализуемых класcах должен быть некий id (штрих-код, isbn, id и т.д.)
    //Главное - не функциональность, а последовательность от классов через интерфейс к тестам и имплементации.

    // Заполните массив целых чисел числами по порядку от 1 до 100.
    // Задумайте случайное число в интервале от 1 до 100 и добавьте его в массив
    // на произвольную (случайную) позицию. Найдите добавленный в массив дубликат наиболее простым способом.
public Integer id;
public String name;
public Double price;

    public Computer(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Computer getContent() {
        return this.getContent();
    }
}
