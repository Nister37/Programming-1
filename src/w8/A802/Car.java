package A802;

public class Car implements Printable, Comparable {
    private String brand;
    private String model;
    private String licensePlate;

    public Car(String brand, String model, String licensePlate) {
        setBrand(brand);
        setModel(model);
        setLicensePlate(licensePlate);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public void print() {
        System.out.printf("Car\n" +
                "===\n" +
                "Brand:         %s\n" +
                "Model:         %s\n" +
                "License plate: %s", getBrand(),getModel(),getLicensePlate());
    }

    @Override
    public boolean isEqualTo(Comparable c) {
        if(c instanceof Car car) {
            return this.getBrand().equals(car.getBrand()) && this.getModel().equals(car.getModel());
        }else {
            return false;
        }
    }

    @Override
    public boolean isGreaterThan(Comparable c) {
        if(c instanceof Car car) {
            return this.getBrand().compareTo(car.getBrand()) > 0;
        }else {
            return false;
        }
    }

    @Override
    public boolean isLessThan(Comparable c) {
        if(c instanceof Car car) {
            return this.getBrand().compareTo(car.getBrand()) < 0;
        }else {
            return false;
        }
    }
}
