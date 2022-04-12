import java.util.*;

public class lab4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoWheeler tw = new TwoWheeler();

        System.out.print("Enter Time taken by Motorcycle (in seconds) : ");

        System.out.print("Enter Time taken by Cycle (in seconds) : ");

    }
}

interface Motorbike{
    public static final double speed = 100;
    public double totalDistance(double time);
}

interface Cycle{
    public static final double distance = 90;
    public double speed(double time);
}

class TwoWheeler implements Motorbike,Cycle{
    @Override
    public double totalDistance(double time) {
        return speed*time;
    }

    @Override
    public double speed(double time) {
        return (distance/time);
    }
}