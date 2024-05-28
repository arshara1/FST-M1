package activities;

interface BicycleParts{
    public int gears = 0;
    public int currentSpeed = 0;
}
interface BicycleOperations{
    public void applyBrake(int decrement);
    public void SpeedUp(int increment);
}
//Base class
class Bicycle implements BicycleParts, BicycleOperations{
    public int gears;
    public int currentSpeed;
    //the Bicycle class one Constructor
    public Bicycle(int gears,int currentSpeed){
        this.gears=gears;
        this.currentSpeed=currentSpeed;
    }
    //Bicycle has three methods


    @Override
    public void applyBrake(int decrement) {
        currentSpeed-=decrement;
        System.out.println("Current Speed:" + currentSpeed);
    }

    @Override
    public void SpeedUp(int increment) {
        currentSpeed+=increment;
        System.out.println("Current Speed:" + currentSpeed);
    }
    //Method to print info of Bicycle
    public String BicycleDesc(){
        return("No of gears:" + gears + "\n Speed of Bicycle is" + currentSpeed);
    }
}
//Derived Class
class MountainBike extends Bicycle{
    //The MountainBike subclass adds one more field
    public int seatHeight;
    //The MountainBike subclass has one more Contractor
    public MountainBike(int gears, int currentSpeed, int starHeight){
        //Invoking base class Bicycle
        super(gears,currentSpeed);
        seatHeight=starHeight;
    }
    //MountainBike subclass add one more method

    public void setHeight(int newvalue) {
        seatHeight = newvalue;
    }

    @Override
    public String BicycleDesc() {
        return (super.BicycleDesc() + "\nSeat Height is :" + seatHeight);
    }

}
public class Activity7 {
    public static void main(String args[]){
        MountainBike mb = new MountainBike(3,2,5);
        System.out.println(mb.BicycleDesc());
        mb.SpeedUp(5);
        mb.applyBrake(4);
    }
}
