package Arrays.April.Easy.fifteen;

import java.util.HashMap;

public class longest_subarray_with_sum_k {
    public static int longest_subarray_sum_k_prefixmap(int[] arr, int target) {
          int sum =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen =0;
          for(int i=0;i<arr.length;i++)  {
              sum = sum + arr[i];

              //case 1: if sum is equal to k
              if(sum == target)
                 maxlen = i+1;

              //case 2 : it lies as an subarray
              if (map.containsKey(sum-target))
              {
                  maxlen = Math.max(maxlen,i-map.get(sum-target));
              }
              //store first occurence
              map.putIfAbsent(sum,i);

          }
          return maxlen;

    }

    public static int longestSubarray_slidingwindow(int[] arr, int target) {
       int left =0, sum =0, maxLen =0;
       for(int right=0; right<arr.length; right++) {
           sum = sum + arr[right];

           while(sum > target) {
               sum = sum - arr[left];
               left++;

           }

           if(sum == target) {
              maxLen = Math.max(maxLen,  right-left+1);
           }

       }
       return maxLen;

    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int sum = 15;
        int maxcount = longest_subarray_sum_k_prefixmap(arr, sum);
        System.out.print("maxcount is"+maxcount);

        int maxcount1 = longestSubarray_slidingwindow(arr, sum);
        System.out.print("maxcount1 is"+maxcount1);
        }
}
