package Vehicle;



public class car extends vehicle{
    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;

    private int currentGear;

    public car(String name, String size, int wheels, int doors, int gear, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changGear(int currentGear){
        this.currentGear =currentGear;
        System.out.println("Car.setcurrentGear() changed to "+this.currentGear+" gear");
    }
    public void changeVelocity(int speed, int direction){

        System.out.println("car.changeVelocity() . velocity "+speed+" direction "+direction);
        move(speed,direction);
    }
}
