package Binary_Search.Easy;

public class Lower_bound
{
    public static int lower_bound(int[] arr, int x)
    {
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;


        while(low<=high)
        {
            int mid = (low+high)/2;
            if (arr[mid]>=x)
            {
               ans = arr[mid];
               low = mid + 1;
            }
            else if (x < arr[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return -1;

    }
    public static void main(String[] args)
    {
        int[] arr = {3,5,8,15,19};
        int x=9;
        int a = lower_bound(arr,x);
        System.out.print("Lower bound is"+a);

    }
}
