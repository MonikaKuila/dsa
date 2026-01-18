package Arrays.Easy.Revision;

public class left_rotate_by_D_places
{
    public static void left_rotate_by_D_places(int[] arr, int k)
    {
        int[] temp = new int[k];

        for(int i=0;i<k;i++)
        {
            temp[i] = arr[i];
        }

        for(int i=2;i<arr.length;i++)
        {
            arr[i-2] = arr[i];
        }

        int j=0;

        for(int i=arr.length-k;i<arr.length;i++)
        {
            arr[i] = temp[j];
            j++;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int k =2;

        left_rotate_by_D_places(arr,k);

    }
}
