package leetCode.easy;

/*
Given an array nums. We define a running sum of an array as
runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
 */
public class RunningSum_1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
