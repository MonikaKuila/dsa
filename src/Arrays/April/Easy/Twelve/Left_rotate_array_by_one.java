package Arrays.April.Easy.Twelve;

public class Left_rotate_array_by_one
{
    public static void left_rotate_by_one (int[] arr)
    {
        int firstitem = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[(arr.length)-1] = firstitem;
        for(int num : arr)
        {
            System.out.print(num);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        left_rotate_by_one(arr);
    }
}
