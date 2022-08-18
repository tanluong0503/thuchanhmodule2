package bai1;

public class Truck extends Vehicle {
    private String tonnage;

    public Truck() {
    }


    public Truck(long id, String brand, String yearOfManufacture, String price, String color, String type, String tonnage) {
        super(id, brand, yearOfManufacture, price, color, type);
        this.tonnage = tonnage;
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage='" + tonnage + '\'' +
                '}';
    }

    @Override
    public void ShowMe() {
        System.out.println(this);

    }
}
