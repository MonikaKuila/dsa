package Arrays.Easy;

import java.util.Arrays;

public class movezerostoend
{
    public static int[] moveZeroesToString(int[] arr)
    {
        int n = arr.length;
        int i =0;
        int j = n-1;
        while(i<j)
        {
            if(arr[i]!=0)
            {
                i++;
            }
            else {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }


        }

        return arr;

    }
    public static void main(String[] args)
    {
        int[] arr = {1,5,0,0,4,7,0,0,8,9,11};
        System.out.println("Array after moving zeroes to end"+ Arrays.toString(moveZeroesToString(arr)));
    }
}
