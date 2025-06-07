package Arrays.Easy;

public class SecondLargest
{
    public static int SecondLargest(int[] arr )
    {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i] > largest)
           {
               largest = arr[i];
           }

           if(arr[i]< largest && arr[i] > secondlargest)
           {
               secondlargest = arr[i];
           }
        }

        return secondlargest;

    }

    public static void main(String[] args)
    {
        int[] arr = {2,67,21,90,23};
        System.out.println("Second Largest"+SecondLargest(arr));
    }
}
