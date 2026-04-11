package Binary_Search.Easy;

import java.awt.image.BandedSampleModel;

public class Upper_bound
{


    public static int upper_bound(int[] arr, int x)
    {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int[] arr = {3,5,8,9,15,19};
        int x=10;
        int ans = upper_bound(arr,x);
        System.out.println("Upper bound is"+ans);
    }
}
