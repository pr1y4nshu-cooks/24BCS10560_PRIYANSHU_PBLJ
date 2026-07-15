interface Drivable {
    void drive();
}

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle implements Drivable {
    int seats;

    Car(int seats, String brand, int speed) {
        super(brand, speed);
        this.seats = seats;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Seats: " + seats);
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

public class vehicleDrive {
    public static void main(String[] args) {
        Car a = new Car(5, "Toyota", 100);
        a.drive();
        a.move();
        a.drive();
    }
}