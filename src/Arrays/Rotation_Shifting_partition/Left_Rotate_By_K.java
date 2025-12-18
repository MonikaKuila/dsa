package Arrays.Rotation_Shifting_partition;

/*1️⃣ ⃣ Left Rotate Array by K

Problem Type: Rotation
Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]

Golden Rules Applied

✔ GR-1 → normalize k
✔ GR-2 → same array overwrite risk
✔ GR-4 → dest < src → loop forward
✔ GR-5 → copy backward though move is right
✔ GR-9 → dry run
✔ GR-10 → O(n), O(k*/

public class Left_Rotate_By_K
{
    public static void left_rotate(int[] arr,int n, int k)
    {
        int[] temp = new int[2];
        //1.Normalize k
        k=k%n;

        //2.//Store first k element into temp to prevent overwriting
        for(int i=0;i<k;i++)
        {
            temp[i] = arr[i];
        }

        //3. elements move forward, destination index < source index, forward, i++
        for(int i=0;i<n-k;i++)
        {
            arr[i] = arr[i+k];
        }

        //4. Copy the temp elements

        for(int i=n-k;i<n;i++)
        {
            arr[i]=temp[i-(n-k)];
        }

        //T(C) = O(N)
        //S(C) = O(K)

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

    public static void left_rotate_optimal(int[] arr,int n, int k)
    {
        /* While reversing keep the indices inclusive*/

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

    }





    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        //Final arr = {3,4,5,1,2}
        int k=2;
        int n = arr1.length;
//        left_rotate(arr1, n,k);
        left_rotate_optimal(arr1, n, k);

        for(int i=0;i<n;i++)
        {
           System.out.print(arr1[i]);
        }
    }
}
