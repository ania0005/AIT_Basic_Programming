import java.util.Iterator;


    //Создайте enum WaterCycleStages с этапами круговорота воды (испарение, конденсация, осадки).
    // Реализуйте Iterable для перечисления, позволяющий пользователю перебирать этапы цикла.

public class WaterCycleStages implements Iterable<WaterCycleStages.Stage> {
    public enum Stage {
        EVAPORATION,
        CONDENSATION,
        PRECIPITATION
    }
    private Stage[] stages;

    public WaterCycleStages() {
        stages = Stage.values();
    }

    @Override
    public Iterator<Stage> iterator() {
        return new WaterCycleIterator();
    }

    private class WaterCycleIterator implements Iterator<Stage> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < stages.length;
        }

        @Override
        public Stage next() {
            return stages[currentIndex++];
        }
    }
}



