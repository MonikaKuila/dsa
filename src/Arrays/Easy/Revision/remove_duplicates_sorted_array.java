package Arrays.Easy.Revision;

import java.util.HashSet;

public class remove_duplicates_sorted_array
{
    public static void remove_duplicates_better(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }

        for(int num :set)
        {
            System.out.print(num);
        }
    }
    public static void remove_duplicates_optimal(int[] arr)
    {
       int j=0;
       for(int i=1;i<arr.length;i++)
       {
           if(arr[j]!=arr[i])
           {
               j++;
               arr[j]=arr[i];
           }
       }

       for(int k=0;k<j+1;k++)
       {
           System.out.print(arr[k]);
       }


    }
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,2,2,3,3};
        remove_duplicates_better(arr);
//        remove_duplicates_optimal(arr);
    }
}
