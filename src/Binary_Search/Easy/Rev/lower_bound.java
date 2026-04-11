package Binary_Search.Easy.Rev;

public class lower_bound
{

    public static int lower_bound(int[] arr, int target)
    {
        int n = arr.length;
        int low =0, high = n-1;
        int index = 0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(target==arr[mid])
            {
                index = mid;
                return index;

            }
            else if(target> arr[mid])
            {
                low=mid+1;
                index = low;
            }
            else
            {
                high = mid -1;
            }
        }

        return index;

    }

    public static void main(String[] args)
    {
        int[] arr = {3,4,6,7,9,12,16,17};
        int target = 9;
        int mid = lower_bound(arr, target);
        System.out.println("Target element is"+mid);
    }
}
