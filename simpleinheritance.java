 class Vehicle {
       void start() {
        System.out.println("Vehicle starts");
    }
}

// Child class
class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

// Main class
public class simpleinheritance {

    public static void main(String[] args) {

        Car c = new Car();

        // Inherited method
        c.start();

        // Child class method
        c.drive();
    }
}
