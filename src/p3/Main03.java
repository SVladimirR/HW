package p3;

import java.util.ArrayList;

public class Main03 {
    static double sym;
    static double discount;
    static int year;
    private static final int MONTHS_YEAR = 12;

    public static void main(String[] args) {

        getData(args);
        viewResult(accumulationTotal(depositCalculator()), accumulationInterestYear(depositCalculator()));
    }

    private static void getData(String[] args) {
        sym = Double.parseDouble(args[0]);
        discount = Double.parseDouble(args[1]);
        year = Integer.parseInt(args[2]);
    }

    private static ArrayList<Double> depositCalculator() {

        ArrayList<Double> value = new ArrayList<>();
        value.add(sym);
        for (int cont = 0; cont < year * MONTHS_YEAR; cont++) {
            value.add(value.get(cont) + (value.get(cont) * (discount / MONTHS_YEAR) / 100));
        }
        return value;
    }

    private static ArrayList<Double> accumulationInterestYear(ArrayList<Double> mount) {

        ArrayList<Double> value2 = new ArrayList<>();
        int dsa = 0;
        for (int cont = 1; cont <= year; ) {
            int asd = cont * MONTHS_YEAR;
            int ddd = dsa * MONTHS_YEAR;
            cont++;
            value2.add((mount.get(asd) - mount.get(ddd)));
            dsa++;
        }
        return value2;
    }

    private static ArrayList<Double> accumulationTotal(ArrayList<Double> mount) {

        ArrayList<Double> value3 = new ArrayList<>();
        for (int cont = 1; cont <= year; ) {
            int asd = cont * MONTHS_YEAR;
            cont++;
            value3.add(mount.get(asd));
        }
        return value3;
    }

    private static void viewResult(ArrayList<Double> total, ArrayList<Double> accruedYear) {

        int cont = 1;
        for (double elem : total) {
            System.out.printf("Total for %s the year  %.2f UAH %n", cont, elem);
            cont++;
        }
        cont = 1;
        for (double elem : accruedYear) {
            System.out.printf("Accrued interest per %s year %.2f UAH %n", cont, elem);
            cont++;
        }
    }
}
