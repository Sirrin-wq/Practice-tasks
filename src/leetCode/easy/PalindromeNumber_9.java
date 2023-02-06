package leetCode.easy;

/*
Given an integer x, return true if x is a
palindrome, and false otherwise.
 */
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
}
