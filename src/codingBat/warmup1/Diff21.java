package codingBat.warmup1;

/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.
 */
public class Diff21 {
    public int diff21(int n) {
        return n <= 21 ? 21 - n: (21 - n) * (-2);
    }
}
