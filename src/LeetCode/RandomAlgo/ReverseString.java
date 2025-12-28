package LeetCode.RandomAlgo;

public class ReverseString {
    public static String reverseString(String string) {
        char [] chars = string.toCharArray();
        int left = 0;
        int right = chars.length-1;

        while (left<right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String string = "Binitam";
        String reversed = reverseString(string);
        System.out.println("Reverse of the given string is: " + reversed);
    }
}
