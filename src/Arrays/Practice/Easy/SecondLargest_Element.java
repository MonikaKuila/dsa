package Arrays.Practice.Easy;

import java.awt.*;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;

public class SecondLargest_Element
{
    public static int secondLargest_BF(int[] arr)
    {
        Arrays.sort(arr);
        return (arr[arr.length-2]);

        //Tc : O(N log n)
    }

    public static int secondLargest_Optimal(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length ;i++)
        {
            max = Math.max(max,arr[i]);
        }

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>sec_max && arr[i]< max)
            {
                sec_max = arr[i];
            }


        }

        return sec_max;

       // TextComponent :O(N)
    }



    public static void main(String[] args)
    {
       int[] arr = new int[]{10, 20, 43, 19, 67};
       int secondLargest = secondLargest_BF(arr);
       System.out.println("Second Largest is"+secondLargest);
        secondLargest = secondLargest_Optimal(arr);
        System.out.println("Second Largest is"+secondLargest);



    }
}
