package afs.training.oo;

public class Driver {

    private final Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void accelerate() {
        this.vehicle.speedUp();
    }
}
