package Arrays.May.Sixth;
/*Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.

You may assume that:

Each input has exactly one solution
You may not use the same element twice
Input:
nums = [2,7,11,15]
target = 9
prefixsum = [2,9,20,35]
Output: [0,1]*/

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        if(arr==null || arr.length==0)
        {
            return new int[] {-1,-1};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {

            int rem = target - arr[i];
            if(map.containsKey(rem))
            {
                return new int[] {map.get(rem),i};
            }

            map.put(arr[i], i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;
        int[] arr =twoSum(nums, target);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
