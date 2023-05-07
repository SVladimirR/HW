package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hw3 {
    public void forPrintFrom1to99() {
        ArrayList<Integer> value = new ArrayList<>();
        for (int cont = 1; cont <= 99; cont++) {
            if (cont % 2 != 0) {
                value.add(cont);
            }
        }
        System.out.println(value);
    }

    public void factorialUsingFor(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        System.out.println(b);
    }

    public void whileDoPrintFrom1to99() {
        ArrayList<Integer> value = new ArrayList<>();
        int i = 1;
        while (i <= 99) {
            if (i % 2 != 0) {
                value.add(i);
            }
            i++;
        }
        System.out.println(value);
    }

    public void factorialUsingWhile(int a) {
        int b = 1;
        int i = 1;
        while (i <= a) {
            b = i * b;
            i++;
        }
        System.out.println(b);
    }

    public void calcDegree(int a, int b) {
        int result;
        result = (int) Math.pow(a, b);
        System.out.println(result);
    }

    public void sequenceOfNumbers() {
        ArrayList<Integer> value = new ArrayList<>();

        int b = 0;
        value.add(b);
        for (int i = 1; i < 10; i++) {
            b -= 5;
            value.add(b);
        }
        System.out.println(value);
    }

    public void multiplicationTable(int a) {
        ArrayList<Integer> value = new ArrayList<>();
        int i = 1;
        while (i <= 10) {
            int b = a * i;
            value.add(b);
            i++;
        }
        System.out.println(value);
    }

    public void unpairedNumbers() {
        ArrayList<Integer> value = new ArrayList<>();
        int i = 1;
        int b = 1;
        value.add(b);
        while (i < 10) {
            b += 2;
            value.add(b);
            i++;
        }
        System.out.println(value);
    }

    public int[] randomArray(int n) {
        int min = -10;
        int max = 10;
        Random random = new Random();
        int[] arr = new int[n];
        arr = Arrays.stream(arr).map(item -> random.nextInt(min, max)).toArray();
        for (int i = 0; i < arr.length; ) {
            i++;
        }
        return arr;
    }

    public void searchMin(int[] arr) {

        var min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("min " + min);
    }

    public void searchMax(int[] arr) {

        var max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("max " + max);
    }

    public void swapMaxAndMin(int[] arr) {

        int min = 0;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            } else if (arr[i] > arr[max]) {
                max = i;
            }
        }
        int temp = arr[min];
        arr[min] = arr[max];
        arr[max] = temp;
    }
}



