package Hw3;

public class WindInstrument extends MusicalInstrument{
    private String material;

    public WindInstrument(String name, String type, double pric, String material) {
        super(name, type, pric);
        this.material = material;
    }
    public void play() {
        System.out.println("Играет - " + this.name + "  Type: " + this.getType() + " Pric: " + this.getPric() +
                " Material: " + this.material);
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
