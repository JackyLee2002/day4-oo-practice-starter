package afs.training.oo;

public class Bus extends Vehicle{

    public static final int BUS_ACCELERATION = 5;

    private final Engine engine;

    public Bus(String name, Integer speed, Engine engine) {
        super(name, speed, BUS_ACCELERATION);
        this.engine = engine;
    }

    @Override
    public void speedUp() {
        this.speed += this.engine.getAcceleration();
        System.out.printf("%s: speed up to %d km/h%n", name, speed);
    }
}
