package Arrays.Easy.Revision;

public class LargestElement
{
    public static int largest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallest(int[] arr)
    {
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static int second_largest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }

            if(arr[i]<largest && arr[i]>second_largest)
            {
                second_largest = arr[i];
            }
        }

        return second_largest;

    }


    public static int second_smallest(int[] arr)
    {
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }

            if(arr[i]>smallest && arr[i]<second_smallest)
            {
                second_smallest = arr[i];
            }
        }

        return second_smallest;

    }

    public static int third_largest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int third_largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }

            if(arr[i] < largest && arr[i] > second_largest)
            {
                second_largest = arr[i];
            }

            if(arr[i]<largest && arr[i]<second_largest && arr[i]>third_largest)
            {
                third_largest = arr[i];
            }
        }

        return third_largest;
    }


    public static void main(String[] args)
    {
//        int[] arr = {3, 4, 5, 9, 10, 15};
        int[] arr = { -9, -11, -12, -6,-5};
        int largest = largest(arr);
        System.out.println("Largest element is"+largest);
        int smallest = smallest(arr);
        System.out.println("Smallest element is"+smallest);
        int second_largest = second_largest(arr);
        System.out.println("Second Largest element is"+second_largest);
        int second_smallest = second_smallest(arr);
        System.out.println("Second Smallest element is"+second_smallest);
        int third_largest = third_largest(arr);
        System.out.println("Third largest is"+third_largest);



    }
}
