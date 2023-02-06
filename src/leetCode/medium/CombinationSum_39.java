package leetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of distinct integers candidates and a target integer target, return a list of all
unique combinations of candidates where the chosen numbers sum to target.
You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times.
Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 */
public class CombinationSum_39 {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int sum) {
        Arrays.sort(arr);
        helper(arr,sum,0,new ArrayList<>());
        return ans;
    }
    public void helper(int [] arr,int sum,int ind,List<Integer> temp){
        if(ind==arr.length){
            return;
        }

        if(arr[ind]==sum){
            ArrayList<Integer> temp2=new ArrayList<>();
            temp2.addAll(temp);
            temp2.add(arr[ind]);
            ans.add(temp2);
            return;
        }
        if(arr[ind]>sum){
            return;
        }

        helper(arr,sum,ind+1,temp);

        ArrayList<Integer> temp2=new ArrayList<>();
        temp2.addAll(temp);
        temp2.add(arr[ind]);
        helper(arr,sum-arr[ind],ind,temp2);
    }
}
