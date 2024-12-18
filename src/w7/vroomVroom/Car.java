package vroomVroom;

public class Car {
    private String brand;
    private Garage garage;

    public Car(String brand, Garage garage) {
        this.brand = brand;
        this.garage = garage;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(Car car) {
        this.brand = car.brand;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", garage=" + garage + '}';
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }
}
