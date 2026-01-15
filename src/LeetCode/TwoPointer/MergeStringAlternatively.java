package LeetCode.TwoPointer;

import java.util.List;

public class MergeStringAlternatively {
    public String mergeAlternatively (String word1, String word2) {
        StringBuilder combinedString = new StringBuilder();

        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()){
               combinedString.append(word1.charAt(i));
               i++;
            }

            if (j < word2.charAt(j)) {
                if (j < word2.length()){
                    combinedString.append(word2.charAt(j));
                    j++;
                }
            }
        }
       return combinedString.toString();
    }

    public static void main(String[] args) {
        MergeStringAlternatively mergeStringAlternatively = new MergeStringAlternatively();
        String word1 = "aabcdeeff";
        String word2 = "bccddeeffge";

        String merged = mergeStringAlternatively.mergeAlternatively(word1, word2);
        System.out.println(merged);

    }
}
