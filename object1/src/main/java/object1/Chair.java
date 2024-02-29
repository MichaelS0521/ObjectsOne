package object1;

public class Chair {
    String material;
    String color;
    int legs;

    public Chair(String material, String color, int legs){
        this.material = material;
        this.color = color;
        this.legs = legs;
    }

    public static void main(String[] args) {
        Chair chair1 = new Chair("Plastic", "White", 3);
    }


}
