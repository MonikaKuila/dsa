package Arrays.April.Easy.eighteen;

public class kadanes_algorithm_max_subarray_sum {

    public static int max_subarray_sum(int[] arr)
    {
        int n = arr.length;
        int sum =0,maxsum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
           sum = sum + arr[i];
            if(sum>maxsum)
            {
                maxsum = sum;

            }
           if(sum<0)
           {
               sum =0;
           }

        }
        return maxsum;
    }

    public static void main(String args[]) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        int[] arr1 = {-2, -3, -7, -2, -10, -4};
        int maxsum = max_subarray_sum(arr);
        System.out.println("maxsum is"+maxsum);
        int maxsum1 = max_subarray_sum(arr1);
        System.out.println("maxsum is"+maxsum1);
    }
}
