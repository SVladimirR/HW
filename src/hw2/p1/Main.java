package hw2.p1;

public class Main {
    static double b;
    static double a;

    public static void main(String[] args) {
        a = 5;
        b = 7;

        viewResylt(calcSymm(a, b));
    }
    private static double calcSymm(double a, double b) {
        return (a + b) / 2;

    }
    private static void viewResylt(double ddd) {
        System.out.println(ddd);
    }

}