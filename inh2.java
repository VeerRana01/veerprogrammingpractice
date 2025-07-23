class vehicle
{
    String model;
    int speed;
    vehicle(String model,int speed)
    {
    this.m=model;
    this.s=speed;
    }
    void displayinfo()
    {
        System.out.println("The Model is="+model);
        System.out.println("The speed is="+speed);
    }
}
class car extends vehicle
{
    int numberOfDoors;
    car(String model,int speed,int numberOfDoors)
    {
        this.nd=numberOfDoors;
        System.out.println("Number of doors="+numberOfDoors);
    }
}
public class inh2 
{
public static void main(String[] args) 
{
    car obj=new car();
    obj.displayinfo();
}    
}