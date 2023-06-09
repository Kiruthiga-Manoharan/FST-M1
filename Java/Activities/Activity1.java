package Activities;

public class Activity1 {
    public static void main(String args[]) {
        Car seltos = new Car();
        seltos.make = 2014;
        seltos.color = "Black";
        seltos.transmission = "Manual";
        seltos.displaycharacteristics();
        seltos.accelerate();
        seltos.brake();
    }
}


