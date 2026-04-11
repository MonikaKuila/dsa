package Arrays.Medium.Revision;

public class Majority_Element
{
    public static int majority_element(int[] nums)
    {
        //F
        int n = nums.length;
        int count = 0;
        int ele = 0;
        //Find the majority element
        for(int i=0;i<n;i++)
        {
            if(count == 0)
            {
                count = 1;
                ele = nums[i];
            }
            else if(ele == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

    }
}
