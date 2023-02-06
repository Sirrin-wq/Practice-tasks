package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s which consists of lowercase or uppercase letters, return the length
 of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome_409 {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                length += 2;
                set.remove(c);
            }
            else set.add(c);
        }
        return set.size() > 0 ? length + 1 : length;
    }
}
