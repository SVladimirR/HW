package hw2.p2;

public class Main01 {
    static double[] a;

    public static void main(String[] args) {


        a = new double[]{5, 6, 7, 8};
        double sum = 0;
        double srSymm;


        for (double i : a) {
            sum += i;
        }
        srSymm = sum / a.length;
        System.out.println(sum);
        System.out.println(srSymm);

    }
}