// Parent Class
class Vehicle {
    String brand;
    int speed;
    int tyre;

    public Vehicle(String brand, int speed , int tyre) {
        this.brand = brand;
        this.speed = speed;
        this.tyre =  tyre;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting at speed " + speed + " km/h.");
    }

    public void no_of_tyre() {
         System.out.println("no of tyre is  " + tyre );
    }
}

// Child Class extending Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int speed, int tyre , int numberOfDoors) {
        super(brand, speed ,tyre); // Call parent constructor
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("The " + numberOfDoors + "-door " + brand + " car is honking: Beep Beep!");
    }
}

// Main Class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120, 4 , 4);
        myCar.start();  // Inherited method from Vehicle
        myCar.honk();   // Defined method in Car
        myCar.no_of_tyre();
    }
}
