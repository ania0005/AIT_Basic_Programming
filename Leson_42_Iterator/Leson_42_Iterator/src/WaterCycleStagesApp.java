public class WaterCycleStagesApp {
    public static void main(String[] args) {
        WaterCycleStages waterCycle = new WaterCycleStages();
        for (WaterCycleStages.Stage stage : waterCycle) {
            System.out.println(stage);}
    }
}
