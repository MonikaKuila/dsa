package Arrays.Easy.Revision;

import java.util.EnumSet;
import java.util.HashMap;

public class longest_subarray_sum_k
{
    public static int prefix_sum(int[] arr, int target)
    {
       int i=0;
       int maxlen =0;
       HashMap<Integer,Integer> map = new HashMap<>();
       int prefixSum =0, maxLen =0;
       for(i=0;i<arr.length;i++)
       {
           prefixSum = prefixSum + arr[i];
       }

       //case1 : prefixsum is equal to k
        if(prefixSum==target)
        {
            return i+1;
        }
        else if(map.containsKey(prefixSum-target))
        {
            maxLen = Math.max(maxLen,i-map.get(prefixSum-target));
        }
        map.putIfAbsent(prefixSum,i);

        return maxLen;

    }

    public static int longest_Twopointers(int[] nums, int k)
    {
      int left =0, sum =0, maxlen =0;
      for(int right=0;right<nums.length;right++)
      {
          sum = sum+nums[right];

          while(sum > k)
          {
              sum = sum - nums[left];
              left++;
          }

          if(sum ==k)
              maxlen = Math.max(maxlen,right-left+1);
      }

      return maxlen;
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int target = 15;
        int len = prefix_sum(arr,target);
        System.out.println("Length of prefix sum is"+len);
        int len1 = longest_Twopointers(arr,target);
        System.out.println("Length of prefix sum is"+len1);

    }


}
