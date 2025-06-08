package Arrays.Easy;

import java.util.Arrays;

public class LeftRotateByDPlace
{
    public static int[] leftRotateByDPlaces(int[] arr, int D)
    {
        int[] temp = new int[D];
        int count =0;
        int n = arr.length;
        for(int i=0;i<D;i++)
        {
            temp[count] = arr[i];
            count++;
        }

        for(int i=0;i<n-D;i++)
        {
            arr[i] = arr[D+i];
        }
        int count1 = 0;
        for(int i=n-D;i<n;i++)
        {
            arr[i] = temp[count1];
            count1++;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {3,5,7,9,10};
        int D=3;
        System.out.println("Array after left rotate by d places"+ Arrays.toString(leftRotateByDPlaces(arr,D)));
    }
}
