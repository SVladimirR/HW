package hw10;

import java.util.*;

public class MethodsHW10_1 {
    public static int countOccurance(List<String> list, String pattern) {
        int cnt = 0;
        for (String s : list) {
            if (s.equals(pattern)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static List<String> toList(List<String> words) {
        List<String> creatList = new ArrayList<>();
        for (String s : words) {
            creatList.add(s);
        }
        return creatList;
    }

    public static List<Integer> findUnique(List<Integer> values) {
        Set<Integer> uniqueNumber = new HashSet<>(values);
        return new ArrayList<>(uniqueNumber);
    }


    public static void calcOccurance(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }

}
