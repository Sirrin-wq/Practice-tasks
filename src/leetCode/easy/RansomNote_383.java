package leetCode.easy;

/*
Given two strings ransomNote and magazine, return true if ransomNote
can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(char ch: magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        for(char ch: ransomNote.toCharArray()) {
            int val = ch - 'a';
            if(count[val] <= 0) return false;
            count[val]--;
        }
        return true;
    }
}
