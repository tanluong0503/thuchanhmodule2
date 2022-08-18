package bai1;

public class Car extends Vehicle {
    private String seatingCapacity;
    private String engineType;

    public Car() {
    }



    public Car(long id, String brand, String yearOfManufacture, String price, String color, String type, String seatingCapacity, String engineType) {
        super(id, brand, yearOfManufacture, price, color, type);
        this.seatingCapacity = seatingCapacity;
        this.engineType = engineType;
    }

    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seatingCapacity='" + seatingCapacity + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    @Override
    public void ShowMe() {
        System.out.println(this);
    }
}
