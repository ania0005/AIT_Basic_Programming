package task_02;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exemple3 {
    public static void main(String[] args) {
        // Компания располагает техникой для всех объектов сразу.
        // Но начало строительства каждого объекта должно начинаться
        // с определённой задержкой (например, после получения разрешения на строительство).

        String[] stages = {
                "1. Проектная деятельность.",
                "2. Начало строительных работ",
                "3. Окончание строительных работ",
                "4. Отделочные работы",
                "5. Сдача объекта"
        };

        System.out.println(new Date());
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);


        service.schedule(new Building("Berlin", stages, true), 3, TimeUnit.SECONDS);
        service.schedule(new Building("Dusseldorf", stages, true), 4, TimeUnit.SECONDS);
        service.schedule(new Building("Essen", stages, true), 5, TimeUnit.SECONDS);
        service.schedule(new Building("Dortmund", stages, true), 8, TimeUnit.SECONDS);

        service.shutdown();

    }
}
