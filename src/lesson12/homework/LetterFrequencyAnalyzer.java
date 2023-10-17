package lesson12.homework;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequencyAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String inputText = scanner.nextLine().toLowerCase();

        Map<Character, Integer> letterFrequency = new HashMap<>();
        final int[] totalLetters = { 0 };

        // Count the freq. of each letter and calculate the total
        for (char c : inputText.toCharArray()) {
            if (Character.isLetter(c)) {
                letterFrequency.put(c, letterFrequency.getOrDefault(c, 0) + 1);
                totalLetters[0]++;
            }
        }

        // Sort the letters in descending order of freq.
        letterFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> {
                    char letter = entry.getKey();
                    int frequency = entry.getValue();
                    double percentage = (double) frequency / totalLetters[0] * 100;
                    String progressBar = "#".repeat((int) percentage);

                    // Print the final graph
                    System.out.printf("%c: %d (%.2f%%) %s%n", letter, frequency, percentage, progressBar);
                });
    }
}

