package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        GasolineEngine gasolineEngine = new GasolineEngine();
        Bus coolBusWithGasEngine = new Bus("Cool Gas Bus", 25, gasolineEngine);
        Driver coolBusWithGasEngineDriver = new Driver(coolBusWithGasEngine);
        coolBusWithGasEngineDriver.accelerate();

        ElectricEngine electricEngine = new ElectricEngine();
        Bus coolBusWithElectricEngine = new Bus("Cool Electric Bus", 25, electricEngine);
        Driver coolBusWithElecEngineDriver = new Driver(coolBusWithElectricEngine);
        coolBusWithElecEngineDriver.accelerate();

        Truck bigTruck = new Truck("Big Truck", 20);
        Driver coolTruckDriver = new Driver(bigTruck);
        coolTruckDriver.accelerate();
    }
}