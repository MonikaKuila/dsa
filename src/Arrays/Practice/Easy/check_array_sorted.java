package Arrays.Practice.Easy;

import java.util.Arrays;

public class check_array_sorted
{
    public static boolean chk_array_sorted_BF(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                    return false;
            }
        }
        //T(C) = O(Nsquare)
        return true;

    }

    public static boolean chk_array_sorted_optimal(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
                    return false;
            }

        return true;

        //T(C) = O(N)

    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 34, 12, 56};
        boolean res = chk_array_sorted_BF(arr);
        System.out.println("Result is"+res);

        res = chk_array_sorted_optimal(arr);
        System.out.println("Result is"+res);


    }
}
