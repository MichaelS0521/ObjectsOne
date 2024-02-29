package object1;

public class Dog {
    String breed;
    String color;
    Boolean cute;

    public Dog(String breed, String color, boolean cute) {
        this.breed = breed;
        this.color = color;
        this.cute = cute;
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Pit Bull", "Brown", true );
    }
}
