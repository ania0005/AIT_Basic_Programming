package Hw1;
//Создайте класс Car с полями make, model, year, и vin (идентификационный
// номер автомобиля). Переопределите методы equals(), hashCode() и toString() для
// этого класса.
// Затем создайте несколько объектов класса Car и проверьте, как работают
// переопределенные методы.
//Создайте несколько объектов класса Car с разными параметрами
//Сравните объекты с использованием метода

import java.util.Objects;

public class Car {
    private  String make;
    private String model;
    private  int year;
    private String vin;

    public Car(String make, String model, int year, String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, vin);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vin='" + vin + '\'' +
                '}';
    }
}
