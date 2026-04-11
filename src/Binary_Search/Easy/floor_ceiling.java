package Binary_Search.Easy;

public class floor_ceiling
{
    public static void find_floor_ceiling(int[] arr, int x)
    {
        int low = 0;
        int n = arr.length;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>=x && arr[mid-1]<=x)
            {
                if(arr[mid]==x) {
                    high = arr[mid];
                    low = arr[mid];
                    break;
                }

                else if(arr[mid-1]<x && arr[mid]>x)
                {
                    low = arr[mid-1];
                    high = arr[mid];
                    break;
                }

            }
            else if(arr[mid]>x)
            {
                high = mid -1;

            }
            else
            {
                low =mid + 1;

            }


        }

        System.out.println("Low is"+low);
        System.out.println("High is"+high);
    }

    public static void main(String[] args)
    {
//        int[] arr = {3, 4, 4, 7, 8, 10}; int x=5;
//        int[] arr = {1,2,2,3,4,6,8}; int x=7;
        int[] arr = {2, 3, 5, 7, 8, 10}; int x=4;
        int n = arr.length;
        find_floor_ceiling(arr,x);
    }
}
