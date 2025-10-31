import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        // Step 1: The given sentence
        String sentence = "The quick brown fox jumps over the lazy dog and the quick brown fox.";

        // Step 2: Remove punctuation (like the period at the end)
        sentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Step 3: Split the sentence into words
        String[] words = sentence.split(" ");

        // Step 4: Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Step 5: Iterate through each word
        for (String word : words) {
            if (word.isEmpty()) continue; // Skip empty strings

            // If word already exists, increase count by 1; else start with 1
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Step 6: Print the results
        System.out.println("Word frequencies:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}
