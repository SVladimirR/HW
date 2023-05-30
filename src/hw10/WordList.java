package hw10;

import java.util.ArrayList;
import java.util.Random;

public class WordList {
    public static ArrayList<Integer> value = createListNumber(15);

    public static ArrayList<String> createList() {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("aaa");
        wordList.add("bbb");
        wordList.add("ccc");
        wordList.add("ddd");
        wordList.add("fff");
        wordList.add("aaa");
        wordList.add("bbb");
        wordList.add("ccc");
        wordList.add("ccc");
        wordList.add("ddd");
        wordList.add("aaa");

        return wordList;
    }


    private static ArrayList<Integer> createListNumber(int quantity) {
        ArrayList<Integer> numberList = new ArrayList<>();

        int min = 0;
        int max = 10;
        Random random = new Random();

        for (int i = 0; i < quantity; ) {
            int a = random.nextInt(min, max);
            numberList.add(a);
            i++;
        }
        return numberList;

    }

}
