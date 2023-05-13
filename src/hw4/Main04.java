package hw4;

import java.util.Arrays;

public class Main04 {
    static double price;
    static int[] route;
    static Data characteristics = new Data();
    static Car car;

    public static void main(String[] args) {
        getPrice(args);
        car = characteristics.getData();
        System.out.printf("Total fuel filled: %.2f  litre %n",
                (fullTankFilling(fuelConsumptionCalc())));
        System.out.printf("Fuel cost: %.2f UAH %n",
                (totalValuePrice(fullTankFilling(fuelConsumptionCalc()), Main04.price)));
        System.out.printf("The rest in the tank at the end of the journey: %.2f litre",
                (restTheEndOfTheRoad(fuelConsumptionCalc(), 3)));
    }

    private static void getPrice(String[] args) {
        price = Double.parseDouble(args[0]);
    }

    private static double[] fuelConsumptionCalc() {
        route = new int[]{0, 179, 331, 479};
        double[] fuelCalc = new double[4];
        fuelCalc[0] = 0;
        for (int i = 1; i < route.length; ) {
            fuelCalc[i] = car.getFlueConsumptionPer100km() * (route[i] - route[i - 1]) / 100;
            i++;
        }
        return fuelCalc;
    }

    private static double restTheEndOfTheRoad(double[] stoppingPlace, int index) {
        double place;
        place = car.getFlueTankVolume() - stoppingPlace[index];
        return place;
    }

    private static double fullTankFilling(double[] fuelConsumptionCalc) {
        double allLitre;
        allLitre = (car.getFlueTankVolume() - car.getResideFlue()) + Arrays.stream(fuelConsumptionCalc).sum();
        return allLitre;
    }

    public static double totalValuePrice(double fullTankFilling, double price) {
        return fullTankFilling * price;
    }
}

