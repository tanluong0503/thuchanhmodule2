package bai1;

public abstract class Vehicle {
    public abstract void ShowMe();

    private long id;
    private String brand;
    private String yearOfManufacture;
    private String price;
    private String color;
    private String type;

    public Vehicle() {
    }

    public Vehicle(long id, String brand, String yearOfManufacture, String price, String color, String type) {
        this.id = id;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
