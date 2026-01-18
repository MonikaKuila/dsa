package Arrays.Easy.Revision;

import java.util.ArrayList;
import java.util.List;

public class union_arrays
{
    public static List<Integer> sort_union(int[] arr1, int[] arr2, int n, int m)
    {
        int i=0,j=0;
        List<Integer> Union = new ArrayList<>();
        while(i<n && j<m)
        {
            //When arr1[i] < arr2[j]
            if(arr1[i]<arr2[j])
            {
                if(Union.isEmpty() || Union.get(Union.size()-1)!=arr1[i])
                {
                    Union.add(arr1[i]);

                }
                i++;
            }
            //When arr2[j] < arr1[i]
            else if(arr2[j]<arr1[i])
            {
                if(Union.isEmpty() || Union.get(Union.size()-1)!=arr2[j])
                {
                    Union.add(arr2[j]);

                }
                j++;
            }

            //When both equal
            else
            {
                if(Union.isEmpty() || Union.get(Union.size()-1)!=arr1[i])
                {
                    Union.add(arr1[i]);

                }
                i++;
                j++;
            }

        }

        while(i<n)
        {
            if(Union.isEmpty() || Union.get(Union.size()-1)!=arr1[i])
            {
                Union.add(arr1[i]);

            }
            i++;

        }

        while(j<m)
        {
            if(Union.isEmpty() || Union.get(Union.size()-1)!=arr2[j])
            {
                Union.add(arr2[j]);

            }
            j++;

        }

        return Union;

    }

    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length;
        int m = arr2.length;

        List<Integer> result = sort_union(arr1,arr2,n,m);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) System.out.print(val + " ");
    }
}
