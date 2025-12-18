package Arrays.Practice.Easy;

public class right_rotate_element_by_one_place
{
    public static int[] rightrotate(int[] arr,int n, int k)
    {
        int temp = arr[n-1],i;
        for(i=n-2;i>=0;i--)
        {
            arr[i+1]=arr[i];

        }
        arr[0] = temp;

        return arr;
    }


    public static void main(String[] args)
    {
        int[] arr = {10,19,34,23,9,65,49};
        int n = arr.length;
        int k=1;
        System.out.print("Original array is");
        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]);
            System.out.println();
        }
        rightrotate(arr,n,k);
        System.out.print("Array after right rotation is");

        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]);
            System.out.println();
        }




    }
}
