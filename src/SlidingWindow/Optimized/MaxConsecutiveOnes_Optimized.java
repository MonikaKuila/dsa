package SlidingWindow.Optimized;

import java.util.Arrays;

public class MaxConsecutiveOnes_Optimized
{
    public static int longestOnes(int[] nums, int k)
    {
        int left = 0;
        int zero=0,maxlen=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
                zero++;
            if(zero>k)
            {
                if(nums[left]==0)
                    zero--;

                left++;
            }


            maxlen = Math.max(right-left+1,maxlen);
        }

        return maxlen;

    }

    public static void main(String args[])
    {
        int[] arr = {0,1,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int[] arr1 = new int[]{1,1,1,0,0,0,1,1,1,1,0};

        int k =3;
        int k1 = 2;

        int len = longestOnes(arr,k);
        System.out.println(Arrays.toString(arr));
        System.out.println("Longest Ones is"+ len);

    }
}