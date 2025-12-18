package Arrays.Practice.Easy;

public class Largest_Element
{
    public static int largest_element_BF(int[] arr)
    {
        int size = arr.length;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr[size-1];
    }
    public static int largest_element(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {

           if(arr[i]>max)
           {
               max = arr[i];
           }

        }
        return max;

    }



    public static void main(String[] args)
    {
        int[] arr = {10, 20, 34, 12, 56};
        int max_BF = largest_element_BF(arr);
        int max = largest_element(arr);
        System.out.println("largest element BF is"+ max_BF);
        System.out.println("largest element is"+ max);
    }
}
