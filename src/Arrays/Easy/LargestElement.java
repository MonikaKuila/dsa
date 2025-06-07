package Arrays.Easy;

public class LargestElement
{
    public static int largest(int[] num)
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(num[i] > largest)
            {
                largest = num[i];
            }
        }

        return largest;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,4,8,9,51,23};
        System.out.println("largest element is"+ largest(arr));


    }
}
