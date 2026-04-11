package Arrays.April.Easy.Twelve;

public class move_zeroes_end {

    public static void move_zeros(int[] nums) {
        //find first zero
        int zP = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zP = i;
                break;
            }

        }
        if (zP == -1)
            return;
        for (int i = zP + 1; i < nums.length; i++) {
            //if non-zero
            if (nums[i] != 0) {
                //swap
                int temp = nums[i];
                nums[i] = nums[zP];
                nums[zP] = temp;
                //move zp
                zP++;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] nums = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        System.out.print("Initial Array");
        for(int num : nums)
            System.out.print(num);
        System.out.print("Modified Array");
        move_zeros(nums);
        for(int num : nums)
            System.out.print(num);
    }
}
