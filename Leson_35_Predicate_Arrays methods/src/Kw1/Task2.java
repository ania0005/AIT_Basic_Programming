package Kw1;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task2 {
    //Создайте массив строк (например, ["apple", "banana", "cherry"]).
    //Определите предикат Predicate<String>, который будет проверять, начинается ли строка на определенную букву ( например, "a").
    //Пройдите по массиву и используйте предикат для фильтрации, чтобы оставить только строки, удовлетворяющие условию.
    //Выведите отфильтрованные строки на экран.
    public static void main(String[] args) {

        String[] myArray = {"apple", "banana", "cherry", "strawberry", "pear", "melon"};

        Predicate<String> startsWithA = (s) -> s.startsWith("a");
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (startsWithA.test(myArray[i])) {
                counter++;
            }
        }
        String[] resultArray = new String[counter];
        for (int i = 0, j = 0; j < resultArray.length; i++) {
            if (startsWithA.test(myArray[i])) {
                resultArray[j] = myArray[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}