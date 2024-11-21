package afs.training.oo;

public class Truck extends  Vehicle {

    public static final int ACCELERATION = 2;

    public Truck(String name, Integer speed) {
        super(name, speed, ACCELERATION);
    }
}
