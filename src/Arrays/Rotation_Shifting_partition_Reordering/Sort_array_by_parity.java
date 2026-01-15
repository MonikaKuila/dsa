package Arrays.Rotation_Shifting_partition_Reordering;

import java.util.ArrayList;
import java.util.List;

public class Sort_array_by_parity
{
    public static void sort_array_parity(int[] arr)
    {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even.add(arr[i]);
            }
            else if(arr[i]%2!=0)
            {
                odd.add(arr[i]);
            }
        }

        int index=0;

         for(int e=0; e<even.size();e++)
         {
            arr[index++] = even.get(e);
         }

        for (int o = 0; o < odd.size(); o++)
        {
            arr[index++] = odd.get(o);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {3,1,2,4};
        //output : {2,4,3,1}

        sort_array_parity(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
