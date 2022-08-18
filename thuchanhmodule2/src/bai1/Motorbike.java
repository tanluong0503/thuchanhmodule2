package bai1;

public class Motorbike extends Vehicle {
    private String cc;

    public Motorbike() {
    }

    public Motorbike(long id, String brand, String yearOfManufacture, String price, String color, String type, String cc) {
        super(id, brand, yearOfManufacture, price, color, type);
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "cc='" + cc + '\'' +
                '}';
    }

    @Override
    public void ShowMe() {
        System.out.println(this);
    }
}
