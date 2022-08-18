package bai1;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(1,"Honda","2022","120000000","Red","Car","2","V6");
        vehicles[1] = new Motorbike(2,"Honda","2022","1200000","Blue","Motorbike","110cc");
        vehicles[2] = new Truck(3,"Huyndai","2020","1305394","Yellow","Truck","23");


        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                vehicle.ShowMe();
            }
            if (vehicle instanceof Motorbike) {
                vehicle.ShowMe();
            }
            if (vehicle instanceof Truck) {
                vehicle.ShowMe();
            }
        }
    }
}
