package KlassWork;

import java.util.TimerTask;

public class BoxAppRunner {
    public static void main(String[] args) {

        BoxSimpe boxSimpleInteger = new BoxSimpe(1);
        BoxSimpleString boxSimpleString = new BoxSimpleString("Hallo World");

        Integer boxIntResult = boxSimpleInteger.getContent();
        String boxStringResult = boxSimpleString.getContent();

        Box box0 = new Box(5);
        Box boxS = new Box("Hallo");
        Box boxC = new Box('C');

        System.out.println(box0.getContent() instanceof Integer);
        System.out.println(boxS.getContent() instanceof String);
        System.out.println(boxC.getContent() instanceof Character);

        Box<Car> boxCar = new Box<>(new Car("TT"));
        System.out.println(boxCar.getContent() instanceof Car);

        Car unboxedCar = boxCar.getContent();
        unboxedCar.getmodel();

        Box<Integer> integerBox = new Box<>(9);
        Box<String> stringBox = new Box<>("STRING");
        Integer intResult = integerBox.getContent();
        String resStr = stringBox.getContent();
    }
}
