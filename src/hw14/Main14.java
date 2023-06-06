package hw14;

public class Main14 {
    public static void main(String[] args) {
        String[][] array = {{"1", "3", "2", "1"}, {"1", "2", "3", "4"}, {"11", "12", "13", "14"}, {"14", "13", "12", "11"}};

        try {
            int result = ArrayValueCalculator.doCalc(array);
            System.out.println("Sum: " + result);
        } catch (ArrayException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}