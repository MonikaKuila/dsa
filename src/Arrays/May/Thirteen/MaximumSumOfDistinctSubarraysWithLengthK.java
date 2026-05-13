package Arrays.May.Thirteen;

import javax.naming.PartialResultException;
import java.util.HashMap;

public class MaximumSumOfDistinctSubarraysWithLengthK {

    public  int maxSumOfDistinctSubarraysWithLength(int[] nums, int k) {
        int left =0;
        int sum1 =0;
        int maxsum1 = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right=0;right<nums.length;right++) {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            sum1 = sum1+ nums[right];

            if(right-left+1==k)
            {
                if( map.size()==k) {
                  maxsum1 = Math.max(maxsum1,sum1);
                }

                sum1 = sum1 - nums[left];
                 map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)
                {
                   map.remove(nums[left]);
                }
                left++;
            }


        }
      return maxsum1;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k =3;
        MaximumSumOfDistinctSubarraysWithLengthK cl = new MaximumSumOfDistinctSubarraysWithLengthK();
        int maxsum = cl.maxSumOfDistinctSubarraysWithLength(nums,k);
        System.out.println("Maxsum is"+maxsum);


    }
}
