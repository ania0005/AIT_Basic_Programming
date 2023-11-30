package task_01;

public enum Degree {
    BACHELOR("Bacalavr"),
    MASTER("Master");
    private String description;
    Degree(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
