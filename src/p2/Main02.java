package p2;

import java.util.Arrays;

public class Main02 {
    static double[] a;

    public static void main(String[] args) {

        viewResylt(calcSymmSr());
    }

    private static double calcSymmSr() {

        a = new double[]{5, 6, 7, 8};
        double sum;

        sum = Arrays.stream(a).sum();

        return sum / a.length;
    }
    private static void viewResylt(double calcSymmSr) {
        System.out.println(calcSymmSr);
    }
}

