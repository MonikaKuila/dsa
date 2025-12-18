package Arrays.Practice.Easy;

public class left_rotate_element_by_one_place
{
    public static int[] left_rotate(int[] arr, int k)
    {
        int n = arr.length;
       int temp;
       temp = arr[0];
       for(int i=1; i<arr.length;i++)
       {
           arr[i-1]=arr[i];

       }
       arr[n-1]= temp;

       return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,6,7,9,1,5,8};
        int k=2;

        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();

        arr = left_rotate(arr,k);

        System.out.println("After left rotating an array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }




    }
}
