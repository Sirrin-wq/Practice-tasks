package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

/*
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */
public class HappyNumber_202 {
    public boolean isHappy(int n)
    {
        Set<Integer> setOfSums = new HashSet<>();
        int copy = n;
        while(copy!=1)
        {
            int sum = 0;
            while(copy>0)
            {
                int rem = copy%10;
                sum += Math.pow(rem,2);
                copy = copy/10;
            }
            if(setOfSums.contains(sum))
            {
                return false;
            }
            setOfSums.add(sum);
            copy = sum;
        }
        return true;
    }
}
