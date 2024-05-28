package activities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public  Plane(int maxPassengers){
        this.maxPassengers=maxPassengers;
        this.passengers= new ArrayList<>();
    }

    public void onboard(String passenger){
        this.passengers.add(passenger);
    }
    public Date takeOff(){
        this.lastTimeTookOf= new Date();
        return lastTimeTookOf;
    }
    public void land(){
        this.lastTimeLanded=new Date();
        this.passengers.clear();
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public List<String> getPassengers(){
        return passengers;
    }
}

public class Activity6 {
public static void main(String[] args) throws InterruptedException
{
    //There is a plane with max of 10 passenger
    Plane plane = new Plane(10);
    //Add passengers to the list
    plane.onboard("John");
    plane.onboard("Abrahim");
    plane.onboard("Alexander");
    //Plane takes off
    System.out.println("Plane took off at : " + plane.takeOff());
    //print list of passengers onboard
    System.out.println("People on the passenger" + plane.getPassengers());
    //Flying time
    Thread.sleep(5000);
    //Plane has landed
    plane.land();
    //Plane Lands
    System.out.println("Plane last time landed at: " + plane.getLastTimeLanded());
    System.out.println("People on the plane after landing: " + plane.getPassengers());
}
}
