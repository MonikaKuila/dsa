package Arrays.April.Easy.eleven;

import java.util.HashSet;

public class remove_duplicates_from_sorted_array {

    public static int remove_duplicates_better(int[] nums) {
        int index = 0;
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);
                nums[index] = num;
                index++;
            }
        }
        return index;
    }
    //TC : O(N sqaure)

    public static int remove_duplicates_optimal(int[] nums) {
    int j=0;
    for(int i=1; i<nums.length; i++)
    {
        if(nums[i]!=nums[j])
        {
            j++;
            nums[j] = nums[i];
        }
    }
    //j is the last index , count will be j+1;
    return j+1;
    }


    public static void main(String[] args)
    {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int size = remove_duplicates_better(nums);
        System.out.println("Better Approach");
        for(int i=0;i<size;i++) {
            System.out.print(nums[i]);
        }
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int size1 = remove_duplicates_optimal(nums1);
        System.out.println("Optimal Approach");
        for(int j=0;j<size1;j++) {
            System.out.print(nums1[j]);
        }

    }
}
