package object1;

public class Person {
    String name;
    int age = 0;
    int height; //centimeters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 6;
    }
    public static void main(String[] args) {
        // Declare and initialize an object
        Person person = new Person("John", 30);

    }
}
