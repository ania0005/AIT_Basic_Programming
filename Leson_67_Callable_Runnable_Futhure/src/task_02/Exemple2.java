package task_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemple2 {
    public static void main(String[] args) {
        // Компания имеет технику для строительства двух объектов.
        // Поэтому строительство объектов возможно одновременно по два.

        String[] stages = {
                "1. Проектная деятельность.",
                "2. Начало строительных работ",
                "3. Окончание строительных работ",
                "4. Отделочные работы",
                "5. Сдача объекта"
        };
        ExecutorService service = Executors.newFixedThreadPool(2);


        service.execute(new Building("Berlin", stages, false));
        service.execute(new Building("Dusseldorf", stages, false));
        service.execute(new Building("Essen", stages, false));
        service.execute(new Building("Dortmund", stages, false));

        service.shutdown();

    }
}
