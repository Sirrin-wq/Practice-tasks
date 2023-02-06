package leetCode.easy;

/*
Given an integer array nums, move all the even integers at the beginning of
the array followed by all the odd integers.
Return any array that satisfies this condition.
 */
public class SortArrayByParity_905 {
    public int[] sortArrayByParity(int[] A)
    {
        int [] arr = new int [A.length];
        int j = 0;
        int k = A.length-1;
        for(int i = 0; i < A.length; i++)
        {
            if(A[i]%2 == 0)
            {
                arr[j] = A[i];
                j++;
            }
            else
            {
                arr[k] = A[i];
                k--;
            }
        }
        return arr;
    }
}
