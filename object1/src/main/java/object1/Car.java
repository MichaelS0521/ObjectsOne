package object1;

public class Car {
    String brand; //Instance Variables
    String color;
    int numwheels;

    //Constructor
    public Car(String brand, String color, int numwheels) {
        this.brand = brand;
        this.color = color;
        this.numwheels = numwheels;
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "Blue", 4);
    }

    Car[] car = new Car[10];

    Car car1 = new Car("BMW", "Blue", 4);
    Car car2 = new Car("FordF150", "White", 4);
}
