package Vehicle;
public class main{
    public static void main(String[] args) {
        OutLander outLander = new OutLander(36);
        outLander.accelerate(30);
        System.out.println("******************************************");
        outLander.accelerate(-10);
    }

}