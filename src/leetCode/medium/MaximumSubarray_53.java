package leetCode.medium;

/*
Given an integer array nums, find the subarray
with the largest sum, and return its sum.
*/
public class MaximumSubarray_53 {
    public int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum < 0)
                sum = A[i];
            else
                sum += A[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
}
