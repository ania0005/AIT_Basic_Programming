package task_4;

import java.util.function.Function;

public class IdentityTest {
    public static void main(String[] args) {

        Function<String, String> function = Function.identity(); // x -> x; == Function.identity();
        System.out.println(function.apply("Hello"));
        System.out.println("Hello");
    }
}
