package hw4;

import java.util.Scanner;

public class Data {
    public Car getData() {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicate the characteristics of the car");
        System.out.print("Specify the volume of the fuel tank: ");
        car.setFlueTankVolume(scanner.nextInt());
        System.out.print("Indicate the remaining fuel in the tank: ");
        car.setResideFlue(scanner.nextInt());
        System.out.print("Enter flue consumption per 100 km: ");
        car.setFlueConsumptionPer100km(scanner.nextDouble());
        return car;
    }
}

