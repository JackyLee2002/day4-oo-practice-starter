package afs.training.oo;

public class Vehicle {

    protected  String name;

    protected  Integer speed;

    protected Integer acceleration;

    public Vehicle(String name, Integer speed, Integer acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public void speedUp() {
        this.speed += this.acceleration;
        System.out.printf("%s: speed up to %d km/h%n", name, speed);
    }
}
