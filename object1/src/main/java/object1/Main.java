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
        }



}//class
