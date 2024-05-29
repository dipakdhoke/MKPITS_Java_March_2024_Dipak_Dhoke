package hashset13;


import java.util.*;

public class DuplicateWordFilter {
    private Set<String> uniqueWords;

    public DuplicateWordFilter() {
        uniqueWords = new HashSet<>();
    }

    public void addWords(List<String> words) {
        uniqueWords.addAll(words);
    }

    public boolean checkWordExists(String word) {
        return uniqueWords.contains(word);
    }

    public void removeWord(String word) {
        uniqueWords.remove(word);
    }

    public void displayUniqueWords() {
        System.out.println("Unique Words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        DuplicateWordFilter filter = new DuplicateWordFilter();

        filter.addWords(Arrays.asList("apple", "banana", "apple", "orange", "banana"));
        filter.displayUniqueWords();

        System.out.println("\nCheck if 'banana' exists: " + filter.checkWordExists("banana"));

        filter.removeWord("banana");
        filter.displayUniqueWords();
    }
}

