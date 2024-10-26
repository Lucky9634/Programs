package Oops_Questions;

public class Car {
    static int currentFuelInLiters;
    int noOfWheels;
    String color;
    float maxSpeed;
    int noOfSeats;
    boolean start;

    static {
        currentFuelInLiters = 0;
    }
    {
        currentFuelInLiters++;
    }
    Car(int noOfWheels, String color, float maxSpeed, int currentFuelInLiters, int noOfSeats){
        this.noOfSeats = noOfWheels;
        this.noOfWheels = noOfSeats;
        this.color = color;
        this.maxSpeed = maxSpeed;
        Car.currentFuelInLiters = currentFuelInLiters;

    }
    Car(String color, int currentFuelInLiters){
        this(0,color,0,currentFuelInLiters,0);

    }

    public void addFuel(int fuel){
        currentFuelInLiters += fuel;
    }
    public  static int getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
    public void started(){
        if(currentFuelInLiters == 0){
            start = false;
            System.out.println("Car Is Not Started.");
        }else if (currentFuelInLiters < 3) {
            start = true;
            System.out.println("Car Is The Reserved Mode. Please Fill The Fuel.");
        }else {
            start = true;
            System.out.println("Car Has Started.");
        }
    }
    public void drive(){
        if (start){
            System.out.println("Car Is Driving");
        }else {
            System.out.println("Car Is Not Driving");
        }
        currentFuelInLiters --;

    }


    public static void main(String[] args) {
        Car myCar = new Car(4,"Black",230,1,7);
        myCar.started();
        myCar.drive();

    }
}
