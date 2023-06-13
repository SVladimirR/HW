package hw15.homeWorkApp;

public class MethodsHw15 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a;
        int b;
        a = 5;
        b = -6;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сума позитивна");

        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void compareNumbers() {
        int a;
        int b;
        a = 5;
        b = -6;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void printColor() {
        int value;
        value = 100;
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else if (value > 100) {
            System.out.println("Зелений");
        }
    }

    public static boolean checkMoreOrLess(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void positiveOrNegative(int a) {

        if (a >= 0) {
            System.out.println("Число додатнє ");
        } else {
            System.out.println("Число від’ємне ");
        }
    }

    public static boolean positiveOrNegativeBol(int a) {
        if (a >= 0) {
            return false;
        }
        return true;
    }
    public static void printString(String a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
