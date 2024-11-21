package afs.training.oo;

public class Truck {

    private String name;

    private Integer speed;

    public Truck(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        this.speed += 2;
        System.out.printf("%s: speed up to %d km/h%n", name, speed);
    }
}
