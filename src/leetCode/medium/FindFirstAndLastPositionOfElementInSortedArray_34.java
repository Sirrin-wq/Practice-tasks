package leetCode.medium;

/*
Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 */
public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] rest = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            if (target == nums[i]){
                rest[0] = i;
                while ( i < nums.length && target == nums[i] ){
                    rest[1] = i++;
                }
                break;
            }
        }
        return rest;
    }
}
