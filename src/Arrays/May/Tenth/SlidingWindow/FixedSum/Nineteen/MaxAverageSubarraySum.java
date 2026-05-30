package Arrays.May.Tenth.SlidingWindow.FixedSum.Nineteen;

public class MaxAverageSubarraySum {

    public static double maxavg(int[] arr, int k)
    {
        if( arr==null || arr.length<k )
        {
            return -1;
        }
        int start = 0;
        int sum =0;

        for(int i =0;i<k;i++)
        {
           sum+=arr[i];
        }
        int maxsum = sum;
        for(int end=k;end<arr.length;end++)
        {
           sum = sum -arr[start] + arr[end];
           maxsum = Math.max(maxsum, sum);
           start++;
        }
        return (double) maxsum / k;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,12,-5,-6,50,3};
        int k =4;
        double avg = maxavg(arr,k);
        System.out.println("Average is"+avg);

    }
}
