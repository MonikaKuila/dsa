package Arrays.April.Easy.eighteen;

public class kadanes_algo_print_subarray {

    public static void max_subarray_sum(int[] nums)
    {
        int sum =0, maxsum =Integer.MIN_VALUE;
        int ansstart=0, ansend = 0,start=0;
        for(int i=0;i<nums.length;i++) {
            if(sum == 0) {
                start = i;
            }
            sum = sum +nums[i];

           if(sum > maxsum) {
             maxsum = sum;
              ansstart = start;
              ansend = i;
           }
           if(sum<0) {
               sum =0;
           }
        }
        for (int j=ansstart; j<=ansend; j++)
        {
            System.out.print(nums[j]+ " ");
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 5, -2, 7, -4};
        max_subarray_sum(nums);
    }

}
