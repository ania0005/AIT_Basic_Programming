package homeWork;

import java.util.HashMap;
import java.util.Map;

public class HomeWork_1_variant2 {

    public static void main(String[] args) {

        Map<String, String> flights = new HashMap<>();

        flights.put("Berlin", "London");
        flights.put("Tokyo", "Seoul");
        flights.put("Mumbai", "Berlin");
        flights.put("Seoul", "Mumbai");
        flights.put("London", "Madrid");
        flights.put("Barcelona", "Tokyo");
        flights.put("Moscow", "Paris");
        flights.put("Paris", "Rome");

        String startCity = getStartCity(flights);
        System.out.println("Стартовый город - " + startCity);
        System.out.println("Маршрут - " + createRoute(flights, startCity));
    }

    public static String getStartCity(Map<String, String> flights) {
        for (String currentCity : flights.keySet()) {
            if (!flights.containsValue(currentCity)) {
                return currentCity;
            }
        }
        return null;
    }

    public static String createRoute(Map<String, String> flights, String startCity) {
        // Barcelona -> Tokyo, Tokyo -> Seoul,
        StringBuilder builder = new StringBuilder();
        String landingCity = flights.get(startCity);

        while (landingCity != null) {
            builder.append(startCity).append(" -> ").append(landingCity).append(", ");
            startCity = landingCity;
            landingCity = flights.get(startCity);
        }
        builder.setLength(builder.length() - 2);
        return builder.toString();
    }
}
