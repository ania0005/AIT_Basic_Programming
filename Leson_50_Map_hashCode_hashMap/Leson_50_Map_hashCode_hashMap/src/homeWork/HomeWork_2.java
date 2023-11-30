package homeWork;

import java.util.HashMap;
import java.util.Map;

public class HomeWork_2 {
    // 2. Первый элемент, встречающийся k раз в массиве
    public static void main(String[] args) {

        String[] sityArray = new String[]{"Chicago", "Philadelphia", "Los Angeles", "Chicago",
                "Houston", "Phoenix", "Philadelphia", "Chicago", "Phoenix"};
        int numberOfCopies = 2;

        HashMap<String, Integer> sytyMap = new HashMap<>();

        for (String sity : sityArray) {
            Integer counter = sytyMap.get(sity);
            if (counter == null) {
                sytyMap.put(sity, 1);
            } else {
                sytyMap.put(sity, ++counter);
            }
        }
        System.out.println(sytyMap);
        for (Map.Entry<String, Integer> pair : sytyMap.entrySet()) {
            if (numberOfCopies == pair.getValue()) {
                System.out.println("City " + pair.getKey() + " occurs " + numberOfCopies + " times in the array");
                return;
            }
        }
    }
}
