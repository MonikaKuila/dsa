package Arrays.April.Easy.Twelve;

public class left_rotate_by_k_places {
    public static int[] left_rotate_by_k_places (int[] arr, int k)
    {
        int[] temp = new int[k];
        int n = arr.length;
        for(int i=0;i<k;i++)
        {
            temp[i] = arr[i];
        }
        int j=0;
        for(int i=k; i<n ; i++)
        {
           arr[j]  = arr[i];
           j++;
        }
        for(int i=0;i<k;i++)
        {
            arr[n-k+i] = temp[i];
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int k =2;
        System.out.print("Original Array");
        for(int num : arr)
        {
            System.out.print(num);
        }
        System.out.print("Left rotated by k places");
        int[] arr1 = left_rotate_by_k_places(arr,k);
        for(int num : arr1)
        {
            System.out.print(num);
        }
    }
}
