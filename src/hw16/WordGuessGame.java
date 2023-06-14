package hw16;


import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {

   public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void startGame() {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String wordToGuess = words[randomIndex];

        boolean guessed = false;
        Scanner scanner = new Scanner(System.in);

        while (!guessed) {
            System.out.print("Guess the word: ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.equals(wordToGuess)) {
                guessed = true;
                System.out.println("Congratulations! You guessed the word correctly.");
            } else {
                String maskedWord = getMaskedWord(wordToGuess, guess);
                System.out.println("Incorrect guess. Here is the word with correct letters revealed:");
                System.out.println(maskedWord);
            }
        }

        scanner.close();
    }

    public static String getMaskedWord(String word, String guess) {
        StringBuilder masked = new StringBuilder();
        int length = Math.max(word.length(), guess.length());

        for (int i = 0; i < length; i++) {
            if (i < word.length() && i < guess.length() && word.charAt(i) == guess.charAt(i)) {
                masked.append(word.charAt(i));
            } else {
                masked.append("#");
            }
        }

        return masked.toString();
    }

}