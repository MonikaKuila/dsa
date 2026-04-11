package Arrays.April.Easy.eleven;

public class Second_Largest
{
    public static void second_largest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int largest_pos=0, second_largest_pos = 0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>largest)
           {
               second_largest = largest;
               largest = arr[i];
           }
           if(arr[i]>second_largest && arr[i]<largest)
           {
               second_largest = arr[i];
               second_largest_pos = i;
           }
        }

        System.out.print("Second largest element is"+ second_largest + "second largest position is" + second_largest_pos);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,4, 5, 7, 11, 19, 27, -91};
        second_largest(arr);


    }
}
