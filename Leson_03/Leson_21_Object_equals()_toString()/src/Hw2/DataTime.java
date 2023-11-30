package Hw2;

import java.util.Date;
import java.util.Objects;

//Создайте класс DataTime для представления даты и времени, с полями year, month, day, hour и minute.
//Переопределите метод toString() для класса DateTime так, чтобы он возвращал строку в формате "ГГГГ-ММ-ДД ЧЧ:ММ".
//Создайте несколько объектов DateTime и запишите их в массив, с разными данными
//Создайте ещё один объект DateTime, который будет являться целью для поиска.
//Напишите код, который ищет первое совпадение объекта DateTime из пункта 3 в массиве объектов из пункта 2.
// Используйте метод equals() для сравнения объектов.
//Выведите на экран результат поиска, показывая найденное совпадение или сообщение о его отсутствии. Обратите
// внимание на формат вывода.
public class DataTime {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    public DataTime(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "\"" + year +
                "-" + month +
                "-" + day +
                " " + hour +
                ":" + minute +
                "\"";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataTime dataTime = (DataTime) o;

        if (year != dataTime.year) return false;
        if (month != dataTime.month) return false;
        if (day != dataTime.day) return false;
        if (hour != dataTime.hour) return false;
        return minute == dataTime.minute;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + month;
        result = 31 * result + day;
        result = 31 * result + hour;
        result = 31 * result + minute;
        return result;
    }
}