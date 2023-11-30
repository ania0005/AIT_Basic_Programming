package task_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapeTest {
    public static void main(String[] args) {
        // Tomato -> 90
        Map<String, Integer> prodacts = new HashMap<>();

        prodacts.put("Banana", 120);
        prodacts.put("Apple", 90);
        prodacts.put("Orange", 200);
        prodacts.put("Pear", 150);
        prodacts.put("Banana", 130);
        prodacts.put("Orange", 210);

        System.out.println("Orange price - " + prodacts.get("Orange"));
        System.out.println("Banana price - " + prodacts.get("Banana"));
        System.out.println("Cocos price - " + prodacts.get("Cocos"));
        System.out.println(prodacts);

        System.out.println();
            for (Map.Entry<String, Integer> pair : prodacts.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            String forPrint = String.format("Name - %s, price - %d.", key, value);
            System.out.println(forPrint);
        }
            // %s - строка
            // %d - целое число
            // %b - boolean значение
            // %f - дробное число
            // %.2f - дробное число с двумя знаками после запятой
            // %c - символы
            // %t - объект, содержащий дату-время

        System.out.println();
        System.out.println("Products without price");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (String currentProdact : prodacts.keySet()){
                System.out.println(currentProdact);
                }

        System.out.println();
        System.out.println("Average product price");
        int sum = 0;
        for (int currentPrice : prodacts.values()) {
            sum += currentPrice;
        }
        System.out.println(sum / prodacts.size());

        Iterator<Map.Entry<String, Integer>> iterator = prodacts.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            if(pair.getValue() < 150) {
                iterator.remove();
            }
        }
        System.out.println(prodacts);
    }
}
