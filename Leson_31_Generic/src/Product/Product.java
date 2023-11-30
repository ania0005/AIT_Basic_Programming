package Product;

public class Product {
    //Домашнее задание: Создайте класс Product, представляющий товар с полями id, name и price.
    //
    //Напишите Comparator, который сравнивает товары по цене.
    //Напишите Comparator, который сравнивает товары по id.
    //создайте массив товаров и отсортируйте его по цене используя Arrays.sort()
    //отсортируйте массив его по id Arrays.sort()
    //Для сортировки используйте свои компараторы.
    public Integer id;
    public String name;
    public int price;

    public Product(Integer id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.println();
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
