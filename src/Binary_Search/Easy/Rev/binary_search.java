package Binary_Search.Easy.Rev;

public class binary_search
{
    public static int bin_search(int[] arr, int target)
    {
        int n = arr.length-1;
        int low =0,high = n-1;
        int mid = 0;
        while(low<high)
        {
            mid = (low+high)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return mid;
    }

}
