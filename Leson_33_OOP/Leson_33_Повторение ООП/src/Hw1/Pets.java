package Hw1;

public class Pets {
    public Integer id;
    public String type;  //вид
    public String breed;  //порода
    public Double cost;   //стоимость пребывания
    public Double revenue;  //выручка отеля

    public Pets(Integer id, String type, String breed, Double cost, Double revenue) {
        this.id = id;
        this.type = type;
        this.breed = breed;
        this.cost = cost;
        this.revenue = revenue;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public Double getCost() {
        return cost;
    }

    public Double getRevenue() {
        return revenue;
    }
}
