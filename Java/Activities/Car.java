package activities;

public class Car {
    //Class member variables
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;

    //Constructors
    Car() {
        tyres = 4;
        doors = 4;
    }
    //Class Methods
    public void displaycharacteristics(){
        System.out.println("Color of the Car: " + color);
        System.out.println("Make of the Car: " + make);
        System.out.println("Transmission of the Car: " + transmission);
        System.out.println("number of the Doors: " + doors);
        System.out.println("Number of the tyres " + tyres);

    }
public void accelerate(){
        System.out.println("car is moving forward ");
}
public void brake(){
        System.out.println("Car has Stopped");

}
}
