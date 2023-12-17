package task_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemple1 {
    public static void main(String[] args) {
        // Компания имеет технику только для строительства одного объекта.
        // Поэтому строительство объектов возможно только по очереди.

        String[] stages = {
                "1. Проектная деятельность.",
                "2. Начало строительных работ",
                "3. Окончание строительных работ",
                "4. Отделочные работы",
                "5. Сдача объекта"
        };
        ExecutorService service = Executors.newSingleThreadExecutor();

        service.execute(new Building("Berlin", stages, false));
        service.execute(new Building("Dusseldorf", stages, false));
        service.execute(new Building("Essen", stages, false));
        service.execute(new Building("Dortmund", stages, false));

        service.shutdown();

    }
}
