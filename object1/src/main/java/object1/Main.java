package object1;

import java.net.CacheRequest;
import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());

        Person person = new Person("Michael", 21);

        System.out.println(person.height);

        Chair chair = new Chair("Wood", "Brown", 4);

        System.out.println(chair.material + ", " + chair.color + ", " + chair.legs);

        Dog dog = new Dog("Pit Bull", "Brown", true );

        System.out.println(dog.breed + ", " + dog.color + ", " + dog.cute);

        Car car = new Car("BMW", "Blue", 4);

        System.out.println(car.brand + ", " + car.color + ", " + car.numwheels);

        Car[] cars = new Car[3];

        Chair[] chairs = new Chair[3];

        Car car1 = new Car("BMW", "Blue", 4);
        Car car2 = new Car("FordF150", "White", 4);
        Car car3 = new Car("Volvo", "Black", 4);

        Chair chair1 = new Chair("Oak Wood", "Brown", 4);
        Chair chair2 = new Chair("Plastic", "Black", 4);
        Chair chair3 = new Chair("Burch Wood", "Light Brown", 4);

        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        chairs[0] = chair1;
        chairs[1] = chair2;
        chairs[2] = chair3;

        System.out.println("\n\nChairs available in Store: " + chair1.material + "-" + chair1.color + ", " + chair2.material + "-" + chair2.color + ", " + chair3.material + "-" + chair3.color);

        System.out.println("\n\nCars available on lot A: " + car1.brand + "-" + car1.color + ", " + car2.brand + "-" + car2.color + ", " + car3.brand + "-" + car3.color);


    }




}//class
