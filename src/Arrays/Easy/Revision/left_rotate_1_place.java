package Arrays.Easy.Revision;

public class left_rotate_1_place
{
    public static int[] left_rotate(int[] arr)
    {
        int left = arr[0];
       for(int i=1;i<arr.length;i++)
       {
          arr[i-1] = arr[i];
       }

       arr[arr.length - 1]=left;

       return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        arr = left_rotate(arr);
        System.out.println("Rotated array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }


    }
}
