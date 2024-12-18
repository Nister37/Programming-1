import vroomVroom.*;

public class Ex08 {
    public static void main(String[] args) {
        Car car = new Car("Ford S-MAX");
        Garage garage = new Garage("Neyt");
        car.setGarage(garage);

        System.out.println(car);  // implicit call to toString

        car = new Car("Ford Focus", garage);

        System.out.println(car);  // implicit call to toString

        car = new Car("Mercedes C", new Garage("Van Winkel"));

        System.out.println(car);  // impliciete call to toString

        Car copy = new Car(car);

        System.out.println(copy);  // implicit call to toString
    }
}