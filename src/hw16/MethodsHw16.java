package hw16;

public class MethodsHw16 {
    public static int findSymbolOccurance(String a, char b) {
        int cnt = 0;
        char[] c = a.toCharArray();
        for (char d : c) {
            if (b == d) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int findWordPosition(String target, String source) {
        if (source.contains(target)) {
            return source.indexOf(target);
        } else {
            return -1;
        }
    }

    public static String stringReverse(String a) {
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        return b.toString();
    }

    public static boolean isPalindrome(String a) {
        StringBuilder b = new StringBuilder(a);
        String d = b.reverse().toString();
        return a.equalsIgnoreCase(d);
    }

}
