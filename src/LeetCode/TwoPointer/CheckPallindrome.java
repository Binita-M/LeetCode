package LeetCode.TwoPointer;

public class CheckPallindrome {
    public boolean isPallindrome (String string){
        int left = 0;
        int right = string.length()-1;

        while (left<right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPallindrome checkPallindrome = new CheckPallindrome();

        //String string = "racecar";
        String string = "Panama";

        boolean result = checkPallindrome.isPallindrome(string);

        if (result) {
            System.out.println("The string is pallindrome!");
        } else {
            System.out.println("The string is not a pallindrome");
        }
    }
}
