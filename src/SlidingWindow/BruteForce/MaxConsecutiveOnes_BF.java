package SlidingWindow.BruteForce;

import java.util.Arrays;

public class MaxConsecutiveOnes_BF
{
    int maxlen=0;
    public static int longestOnes(int[] nums, int k)
    {
        int len = nums.length;
        int maxlen = 0;
        for(int i=0;i<len;i++)
        {
            int zeros=0;
            int count =0;
            for(int j=i;j<len;j++)
            {


                if(nums[j]==0)
                {
                    zeros++;

                    if(zeros>k)
                    {
                        break;
                    }
                }
                count++;
                maxlen = Math.max(count,maxlen);
            }
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
