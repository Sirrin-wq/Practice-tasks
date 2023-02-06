package leetCode.medium;

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes
the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class ReverseInteger_7 {
    public int reverse(int x) {
        int temp = 0;
        long reverse = 0;

        while (x != 0){
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x /= 10;
        }
        if (reverse < Integer.MAX_VALUE && reverse > Integer.MIN_VALUE){
            return (int)reverse;
        } else {
            return 0;
        }
    }
}
