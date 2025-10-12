package SlidingWindow.BruteForce;

public class BinarySubArrayWithSum
{

        public static int numSubarraysWithSum(int[] nums, int goal)
        {
            int count =0;
            for(int i=0;i<nums.length;i++)
            {
                int sum = 0;
                for(int j=i;j<nums.length;j++)
                {
                    sum = sum + nums[j];
                    if(sum==goal)
                        count++;
                }
            }
            return count;
        }


    public static void main(String args[])
    {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        int count = numSubarraysWithSum(nums,goal);
        System.out.println(count);

        int[] nums1 = {0,0,0,0,0};
        int goal1 = 0;
    }
}
