package LeetCode.RandomAlgo;

import java.util.HashSet;
import java.util.Set;
public class UniqueCharacters {

    public static void printUnique(String string) {
        Set<Character> uniqueChar = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (!uniqueChar.contains(c)) {
                System.out.println(c);
                uniqueChar.add(c);
            }
        }

    }

    public static void main(String[] args) {
        String string = "SWISS";
        System.out.println("Unique characters: ");
        printUnique(string);
    }
}

