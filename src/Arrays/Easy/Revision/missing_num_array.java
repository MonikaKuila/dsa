package Arrays.Easy.Revision;

public class missing_num_array
{
    public static int find_missing_xor(int[] arr,int N)
    {
        int xor1 = 0, xor2 =0;
        int missing_ele;
        for(int i=0;i<N-1;i++)
        {
           xor1 = xor1^arr[i];

           xor2 = xor2^(i+1);

        }

        xor1 = xor1^N;

        return xor1^xor2;

    }

    public static int find_missing_better(int[] arr, int N)
    {
        int sum=0,sum_n=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }

        sum_n = N*(N+1)/2;

        return sum_n - sum;

    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,8,9};
        int N=9;
        int missing_num = find_missing_xor(arr,N);
        System.out.print("Missing element is"+missing_num);
        int missing_num_1 = find_missing_better(arr,N);
        System.out.print("Missing number is"+missing_num_1);
    }
}
