package Hw1;

public class Product {
    public Integer barcode;
    public String type;
    public String sellBy;

    public Product(Integer barcode, String type, String sellBy) {
        this.barcode = barcode;
        this.type = type;
        this.sellBy = sellBy;
    }

    public Integer getBarcode() {
        return barcode;
    }

    public String getType() {
        return type;
    }

    public String getSellBy() {
        return sellBy;
    }
}
