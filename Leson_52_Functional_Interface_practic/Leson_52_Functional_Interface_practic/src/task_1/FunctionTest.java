package task_1;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        //функция которая округляет числа
        //123.45 -> 123
        //456.87 -> 457

MyFunction myFunction = new MyFunction();
        System.out.println("Реализация при помощи обычного класса");
        System.out.println(myFunction.apply(123.45));
        System.out.println(myFunction.apply(456.87));

        System.out.println("Реализация при помощи ананимного класса");
        Function<Double, Long> function =new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function.apply(123.45));
        System.out.println(function.apply(456.87));

        System.out.println("Реализация при помощи лямбда выражения");
        Function<Double, Long> lamdaFunction = x -> Math.round(x);
        System.out.println(lamdaFunction.apply(123.45));
        System.out.println(lamdaFunction.apply(-123.45));
        System.out.println(lamdaFunction.apply(456.87));

        // -123.45 -> 123
        System.out.println("Реализация (приведение к положительному числу и округление) при помощи лямбда выражения");
        Function<Double, Long> absolutRounding = x -> {
                double abs = Math.abs(x);
                return Math.round(abs);
            };
        System.out.println(absolutRounding.apply(-123.45));

        System.out.println("Реализация при помощи метода референс");
        Function<Double, Long> referensFunction = Math::round;
        System.out.println(referensFunction.apply(123.45));
        System.out.println(referensFunction.apply(-123.45));
        System.out.println(referensFunction.apply(456.87));

    }
}
