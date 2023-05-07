package hw3;

import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        Hw3 hw = new Hw3();

        System.out.println("task 1");
        hw.forPrintFrom1to99();
        System.out.println();

        System.out.println("task 2");
        hw.factorialUsingFor(5);
        System.out.println();


        System.out.println("task 3");
        hw.whileDoPrintFrom1to99();
        System.out.println();

        System.out.println("task 4");
        hw.factorialUsingWhile(5);
        System.out.println();

        System.out.println("task 5");
        hw.calcDegree(3, 3);
        System.out.println();

        System.out.println("task 6");
        hw.sequenceOfNumbers();
        System.out.println();

        System.out.println("task 7");
        hw.multiplicationTable(7);
        System.out.println();

        System.out.println("task 8");
        hw.unpairedNumbers();
        System.out.println();


        System.out.println("task 9");
        int[] list = hw.randomArray(10);
        System.out.println(Arrays.toString(list));
        hw.searchMin(list);
        System.out.println();

        System.out.println("task 10");
        hw.searchMax(list);
        System.out.println();

        System.out.println("task 11");
        int[] listt={4, -5, 0, 6, 8};
        System.out.println(Arrays.toString(listt));
        hw.swapMaxAndMin(listt);
        System.out.println(Arrays.toString(listt));



    }
}
