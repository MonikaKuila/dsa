package Arrays.Rotation_Shifting_partition_Reordering;

/*1️⃣ Right Rotate Array by K

Problem Type: Rotation
Example: [1,2,3,4,5], k=2 → [4,5,1,2,3]

Golden Rules Applied

✔ GR-1 → normalize k
✔ GR-2 → same array overwrite risk
✔ GR-3 → dest > src → loop backward
✔ GR-5 → copy backward though move is right
✔ GR-9 → dry run
✔ GR-10 → O(n), O(k)*/

public class Right_Rotate_By_K
{
    public static int[] right_rotate(int[] arr, int n, int k)
    {
        //1. Normalize n
        k = k%n;

        //2.Same array : overwrite risk
        // Move last 2 elements to temp array

        int[] temp = new int[k];
        for(int i=n-k;i<n;i++)
        {
            temp[i-(n-k)]= arr[i];
        }

        //3. Shift elements to right where destination > source
        // As per golden rule when destination > source then loop backward (i--)

        for(int i =n-k-1 ; i>=0;i--)
        {
            arr[i+k]=arr[i];
        }

        for(int i=0;i<k;i++)
        {
            arr[i] = temp[i];
        }

        return arr;

    }

    public static void  reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =  temp;
            start++;
            end--;


        }

    }

    public static void right_rotate_optimal(int[] arr,int n, int k)
    {
        /* While reversing keep the indices inclusive*/
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int k=2;
        int n = arr.length;
//
//        right_rotate(arr,n,k);
//
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]);
//        }

        right_rotate_optimal(arr,n,k);
        System.out.print("Right Rotate Optimal");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }

    }
}
