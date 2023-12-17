package Homework.Task1;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task1 {
    // Описать ситуацию, когда компания располагает техникой для строительства всех объектов одновременно,
    // и нет никакой задержки старта строительства по времени. Подсказка: использовать такой пул потоков,
    // который мы на занятии не использовали.

    public static void main(String[] args) {

        String[] stages = {
                "1. Проектная деятельность.",
                "2. Начало строительных работ",
                "3. Окончание строительных работ",
                "4. Отделочные работы",
                "5. Сдача объекта"
        };
        ExecutorService service = Executors.newCachedThreadPool();


        service.execute(new Building("Berlin", stages, false));
        service.execute(new Building("Dusseldorf", stages, false));
        service.execute(new Building("Essen", stages, false));
        service.execute(new Building("Dortmund", stages, false));

        service.shutdown();

    }
}
