package Arrays.May.Sixth;

/*Kadane’s Algorithm — Maximum Subarray Sum
This is one of the MOST important interview algorithms for arrays.
🧠 Problem Statement
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum, and return its sum.
A subarray is a contiguous part of the array.
Input:
nums = [-2,1,-3,4,-1,2,1,-5,4]

Output:
6
*/
/*👉 all negative arrays
✔ Correct Kadane transition

sum=max(arr[i], sum+arr[i])

Excellent.

This is the heart of Kadane’s algorithm.

✔ Correct max tracking
maxsum = Math.max(sum, maxsum);

Perfect.

🧠 Mental Model (write in notes)

👉 “At every index, decide whether to continue previous subarray or start a new one.”

👀 Dry Run Intuition
[-2,1,-3,4,-1,2,1,-5,4]

At:

4

*/
public class MaximumSubArraySumKadanesAlgorithm {

    public static int kadanesAlgo(int[] arr) {
        int sum =arr[0], maxsum = arr[0];
      for(int i=1;i<arr.length;i++) {
          sum = Math.max(arr[i],sum+arr[i]);
          maxsum = Math.max(sum, maxsum);
      }

      return maxsum;
    }


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = kadanesAlgo(nums);
        System.out.print("maxsum is"+sum);

    }

}
