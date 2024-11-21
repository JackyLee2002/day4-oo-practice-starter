package afs.training.oo;

public class Bus {

    private String name;

    private Integer speed;

    public Bus(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        this.speed += 5;
        System.out.printf("%s, speed up to %d km/h%n", name, speed);
    }
}
