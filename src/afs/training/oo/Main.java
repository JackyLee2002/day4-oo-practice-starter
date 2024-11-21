package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Bus coolBus = new Bus("Cool Bus", 25);
        Driver coolBusDriver = new Driver(coolBus);
        coolBusDriver.accelerate();

        Truck bigTruck = new Truck("Big Truck", 20);
        Driver coolTruckDriver = new Driver(bigTruck);
        coolTruckDriver.accelerate();
    }
}