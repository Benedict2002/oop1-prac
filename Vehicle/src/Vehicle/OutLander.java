package Vehicle;
public class OutLander extends car{
    private int roadSideService;

    public OutLander( int roadSideService) {
        super("OutLander", "4WD", 6, 5, 5, false);
        this.roadSideService = roadSideService;
    }
    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changGear(3);
        } else {
            changGear(4);
        }
        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}