package hw14;

public class ArrayValueCalculator {
    public static int doCalc(String[][] aaa)
            throws ArrayException {
        if (aaa.length != 4 || aaa[0].length != 4) {
            throw new ArrayException("Invalid array size");
        }

        int sum = 0;
        for (int i = 0; i < aaa.length; i++) {
            for (int j = 0; j < aaa[i].length; j++) {
                try {
                    int value = Integer.parseInt(aaa[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayException("Incorrect data [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}



