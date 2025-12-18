package Arrays.Practice.Easy;

import java.util.HashSet;

public class remove_duplicates_sorted_array
{
    public static void remove_duplicates_BF(int[] arr)
    {
        int index =0;
        HashSet<Integer> set = new HashSet<>();
        for(int n: arr)
        {
           if(!set.contains(n))
           {
              set.add(n);
              arr[index] = n;
              index++;


           }

        }

        for(int i=0; i<index;i++)
        {
            System.out.print(arr[i]);
        }


    }

    public static int remove_duplicates_optimal(int[] arr)
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;
    }



    public static void main(String[] args)
    {
        int[] arr = {1,1,1,2,2,2,6,6,4,4};
        System.out.print("Before printing");
        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i]);
        }

        System.out.println("After printing for BF");
        remove_duplicates_BF(arr);

        System.out.println("After printing for Optimal");
        int k = remove_duplicates_optimal(arr);

        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]);
        }


    }
}
