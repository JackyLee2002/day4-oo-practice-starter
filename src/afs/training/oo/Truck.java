package afs.training.oo;

public class Truck extends  Vehicle {

    public static final int TRUCK_ACCELERATION = 2;

    public Truck(String name, Integer speed) {
        super(name, speed, TRUCK_ACCELERATION);
    }
}
