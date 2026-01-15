package Arrays.Practice.Easy;

/*Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.*/

public class Linear_search
{
    public static int linear_search(int[] arr, int num)
    {
        int pos = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == num)
            {
                pos =i;
                break;
            }
        }

        return pos;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int num = 3;
        int pos = linear_search(arr,num);
        System.out.println("num found at position"+ pos);
    }
}
