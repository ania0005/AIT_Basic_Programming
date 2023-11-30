package homeWork;

import java.util.*;

public class HomeWork_2_variant2 {

    public static void main(String[] args) {

        String[] array =
                {"AAA", "BBB", "CCC", "DDD", "AAA", "AAA", "AAA", "BBB", "CCC", "BBB", "CCC"};

        int countOfElements = 3;

        System.out.println(getElementByEncounters(array, countOfElements));
    }

    public static Set<String> getElementByEncounters(String[] array, int counter) {

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String currentElement : array) {
            if (map.containsKey(currentElement)) {
                int currentCounter = map.get(currentElement);
                map.put(currentElement, ++currentCounter);
            } else {
                map.put(currentElement, 1);
            }
        }

        Set<String> result = new HashSet<>();

//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            if (pair.getValue() == counter) {
//                return pair.getKey();
//            }
//        }

        for (String element : array) {
            if (map.get(element) == counter) {
                result.add(element);
            }
        }

        return result;
    }
}
