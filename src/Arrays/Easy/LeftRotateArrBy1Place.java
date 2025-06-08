package Arrays.Easy;

import java.util.Arrays;

public class LeftRotateArrBy1Place
{

    public static int[] leftrotate(int[] arr)
    {
        int n = arr.length;
        int temp =arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1] = arr[i];
        }
         arr[n-1] =temp;

        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {3,9,2,7,6,5};
        System.out.println("Array after left rotate by 1 place"+ Arrays.toString(leftrotate(arr)));
    }
}
