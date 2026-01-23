package LeetCode.TopInterviewQuestions.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean isWordPattern (String pattern, String s) {
        // create array of words from string s
        String[] words = s.split(" ");

        //check if length of mapping pattern is equal to the length of words in s
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWordMap = new HashMap<>(); //create map to map character to string
        Map<String, Character> wordToCharMap = new HashMap<>(); //create map to map string to character

        //iterate to get char and word at ith position of pattern and words
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWordMap.containsKey(c)) {
                if (!charToWordMap.get(c).equals(word)) {   //check if the char c in charToWordMap maps to word
                    return false;
                }
                } else {
                    charToWordMap.put(c, word); //if not, create charToWordMap
                }
                if (wordToCharMap.containsKey(word)) {
                    if (wordToCharMap.get(word) != c) {  //check if the word in wordToCharMap maps to char c
                        return false;
                    }
                    } else {
                        wordToCharMap.put(word, c);  //if not, create reverse map
                }
        }
        return true;
    }

    public static void main(String[] args) {
        /*String pattern = "abba";
        String words = "dog cat cat dog";*/
        String pattern = "abba";
        String words = "dog cat cat fish";

        WordPattern wp = new WordPattern();
        boolean result = wp.isWordPattern(pattern, words);
        System.out.println(result);

    }
}
