package WeeklyContest;

import java.util.Arrays;
import java.util.HashSet;

public class missingMultiples
{

        public static int missingMultiple_BruteForce(int[] nums, int k)
        {
            int max = k * (nums.length+1);
            int count = k;
            int j = 1, i;
            int flag = 0;
            while (count < max)
            {
                flag =0;
                for (i = 0; i < nums.length; i++)
                {
                    if (nums[i] == count) {
                        flag = 1;
                        break;
                    }

                }
                if(flag==0)
                {
                   return count;

                }

                j = j + 1;

                count = k * j;
            }
            return count;
        }

    public static int missingMultiple_Optimized(int[] nums, int k)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }

        int multiple =k;

        while(true)
        {
            if(!set.contains(multiple))
            {
                return multiple;
            }
            multiple+=k;
        }


    }

    public static int missingMultiple_Optimal(int[] nums, int k) {
        Arrays.sort(nums);
        int multiple = k;
        while (true) {
            if (Arrays.binarySearch(nums, multiple) < 0) {
                return multiple;
            }
            multiple += k;
        }
    }


        public static void main(String[] args) {
            int[] nums = {8, 2, 3, 4, 6};
            int k = 2;
            int num = missingMultiple_Optimal(nums, k);
            System.out.println("Missing multiple is" + num);

        }
    }

