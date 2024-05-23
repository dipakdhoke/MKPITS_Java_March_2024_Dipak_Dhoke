package Smallestlargest;

import java.util.Scanner;

public class smallestlarge {

    public void smalllarge(){
        StringBuffer inputString = new StringBuffer("Java Programs on String");

        String[] words = inputString.toString().split("\\s+");

        if (words.length == 0) {
            System.out.println("No words found in the input string.");
            return;
        }

        String largestWord = words[0];
        String smallestWord = words[0];

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }

        System.out.println("The largest word is \"" + largestWord + "\" and the smallest word is \"" + smallestWord + "\"");
    }
}

