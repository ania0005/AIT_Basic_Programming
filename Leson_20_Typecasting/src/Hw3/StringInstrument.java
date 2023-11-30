package Hw3;

public class StringInstrument extends MusicalInstrument{
    private int numberOfStrings;

    public StringInstrument(String name, String type, double pric, int numberOfStrings) {
        super(name, type, pric);
        this.numberOfStrings = numberOfStrings;
    }
    public void play(){
        System.out.println("Играет - " + this.name + "  Type: " + this.getType() + " Pric: " + this.getPric() +
                " Number Of Strings: " + this.numberOfStrings);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
