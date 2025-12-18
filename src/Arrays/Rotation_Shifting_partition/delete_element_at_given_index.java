package Arrays.Rotation_Shifting_partition;

public class delete_element_at_given_index
{
    public static void delindex(int[] arr, int pos_del)
    {
        int n = arr.length;
        int[] arr1 = new int[n-1];

        //GR 4: dest< arc: forward loop : i++
        for(int i=pos_del+1;i<n;i++)
        {
            arr1[i-1] = arr[i];
        }

        for(int i=0;i<pos_del;i++)
        {
            arr1[i] = arr[i];
        }

        for(int i=0;i<n-1;i++)
        {
            System.out.print(arr1[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int posdel = 2;
        delindex(arr,posdel);

    }
}
