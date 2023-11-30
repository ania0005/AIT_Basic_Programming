package homeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HomeWork_1 {
    //1. Найти маршрут из заданного списка билетов
    //Учитывая список билетов, найти маршрут по порядку, используя данный список.
    //Вход:
    //kay       //value
    //«Berlin» -> «London»
    //«Tokyo» -> «Seoul»
    //«Mumbai» -> «Berlin»
    //«Seoul» -> «Mumbai»
    //Выход:
    //Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->London

    public static void main(String[] args) {

        Map<String, String> flights = new HashMap<>();

        flights.put("Berlin", "London");
        flights.put("Tokyo", "Seoul");
        flights.put("Mumbai", "Berlin");
        flights.put("Seoul", "Mumbai");

        String currentValue = "";
        String currentKey = "";
        String result = "";

        for (Map.Entry<String, String> flight : flights.entrySet()) {
            currentKey = flight.getKey();
            int counter = 0;
            for (Map.Entry<String, String> pair : flights.entrySet()) {
                if (currentKey.equals(pair.getValue())) {
                    counter++;
                }
                ;
            }
            if (counter == 0) {
                currentValue = flight.getValue();
                result += (currentKey + " -> " + currentValue + ", ");
            }
        }

        int counter = 0;
        while (counter != flights.size() - 1){
            for (Map.Entry<String, String> pair : flights.entrySet()) {
                if (currentValue.equals(pair.getKey())) {
                    result += (pair.getKey() + " -> " + pair.getValue() + ", ");
                    counter++;
                    currentValue = pair.getValue();
                }
                ;
            }
        }
        System.out.println(result.substring(0, result.length() - 2));
    }
}

