package leetCode.easy;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by
deleting some (can be none) of the characters without disturbing the relative positions
of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0; i < s.length(); i++) {

            final int indexOfCharInT = t.indexOf(s.charAt(i));
            if (indexOfCharInT == -1) {
                return false;
            }
            t = t.substring(indexOfCharInT + 1);
        }
        return true;
    }
}
