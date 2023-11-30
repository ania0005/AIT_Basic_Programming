package task_2;

import java.util.function.Function;

public class ConvertTypes {
    public static void main(String[] args) {

        // Есть объект собаки.
        // Задача - написать функцию, которая объект собаки
        // преобразует в объект кошки, при этом увеличивая возраст в два раза
        // и добавляя к цвету приставку "светло-".
        // Собака (возраст 3, цвет серый) -> Кот (возраст 6, цвет светло-серый).

        Function<Dog, Cat> converter = x -> new Cat(x.getAge()*2, "cветло-" + x.getColor());
        Dog dog = new Dog(3, "серый");
        System.out.println("Исходная собака - " + dog);
        System.out.println("Полученый кот - " + converter.apply(dog));

        Dog dog1 = new Dog(5, ",белый");
        Dog dog2 = new Dog(1, "черный");

        System.out.println("Исходная собака - " + dog1);
        System.out.println("Получившийся кот - " + converter.apply(dog1));
        System.out.println("Исходная собака - " + dog2);
        System.out.println("Получившийся кот - " + converter.apply(dog2));
    }
}
