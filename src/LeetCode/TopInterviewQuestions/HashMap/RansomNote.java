package LeetCode.TopInterviewQuestions.HashMap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean isConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> construct = new HashMap<>();

        //put character and its count from the string magazine to construct map
        for (char c : magazine.toCharArray()) {
            construct.put(c,construct.getOrDefault(c,0)+1);
        }
        //check if the construct map contains the character to build the string ransomNote or the character already used up
        for(char c: ransomNote.toCharArray()) {
            if(!construct.containsKey(c) || construct.get(c) == 0) {
                return false;
            }
        construct.put(c, construct.get(c)-1); // keep an inventory of character used by subtracting 1 from the value of the key
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        /*String ransomNote = "abd";
        String magazine = "aaabbccde";*/

        String ransomNote = "abcd";
        String magazine = "bbccddee";

        System.out.println(rn.isConstruct(ransomNote, magazine));
    }
}
