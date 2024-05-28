package activities;

public class Activity1 {
    public static void main(String[] args){
Car toyota =new Car();
toyota.make = 2014;
toyota.color = "Black";
toyota.transmission = "Manual";
//Using car class method
        toyota.displaycharacteristics();
        toyota.accelerate();
        toyota.brake();
    }
}
