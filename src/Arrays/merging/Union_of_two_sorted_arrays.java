package Arrays.merging;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Union_of_two_sorted_arrays
{
    public static void union_of_two_sorted_BF(int[] arr1, int[] arr2)
    {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<arr1.length; i++)
        {
          set.add(arr1[i]);

        }

        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }

        int[] arr = new int[set.size()];
        int i =0;

        for(int num : set)
        {
            arr[i++] = num;
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }

    public static void union_of_two_sorted_optimal(int[] arr1, int[] arr2, int m1, int n1)
    {
        ArrayList<Integer> Union = new ArrayList<>();
        int i=0,j=0;

        while(i<m1 && j<n1)
        {
            if(arr1[i]<arr2[j])
            {
              if(Union.isEmpty() || Union.get(Union.size()-1)!= arr1[i])
                  Union.add(arr1[i]);
              i++;

           }
            else if(arr2[j] < arr1[i])
            {
                if(Union.isEmpty() || Union.get(Union.size()-1)!= arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
            else
            {
                if(Union.isEmpty() || Union.get(Union.size()-1)!= arr1[i])
                    Union.add(arr1[i]);
                i++;
                
            }

            }
    }
    public static void main(String[] args)
    {
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 = {1,2,5,6,7};
        int m = arr1.length;
        int n = arr2.length;


        union_of_two_sorted_BF(arr1, arr2);

        union_of_two_sorted_optimal(arr1, arr2,m,n);
    }
}



/*🥇 How Interviewers Classify These
Sub-Type	Technique
Unsorted arrays	HashSet / HashMap
Sorted arrays	Two pointers
Frequency based	HashMap
Order matters	Extra space
No extra space	Pointer manipulation
Multiple arrays	Heap / Set
🧠 Golden Rules MOST USED in this Category

GR-1 → Check if arrays are sorted

GR-6 → Extra space allowed?

GR-8 → Does order matter?

GR-9 → Handle duplicates carefully

GR-10 → Always state time & space*/
