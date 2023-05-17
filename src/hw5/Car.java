package hw5;

public class Car {
    public void star() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Start Electricity");
    }

    private void startCommand() {
        System.out.println("Start Command");
    }

    private void startFuelSystem() {
        System.out.println("Start Fuel System");
    }


}
