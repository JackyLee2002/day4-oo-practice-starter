package afs.training.oo;

public class Bus extends Vehicle{

    public static final int ACCELERATION = 5;

    public Bus(String name, Integer speed) {
        super(name, speed, ACCELERATION);
    }
}
