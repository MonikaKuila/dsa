package Arrays.Subarray_prefix_sum_sliding_category;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class count_no_of_subarray_sum_equals_k_only_positive
{
    public static void find_subarray_with_sum_k_BF(int[] arr1, int k)
    {

        int n = arr1.length;
        int count=0, maxcount = 0;
        for(int i=0;i<n;i++)
        {
            int sum =0;
            for(int j=i;j<n;j++)
            {
               sum = sum + arr1[j];
               if(sum == k)
               {
                   count++;
                   maxcount = Math.max(maxcount,j-i+1);
                   System.out.print("Subarray is");
                   for(int x=i;x<=j;x++)
                   {
                       System.out.print(arr1[x]);
                       System.out.println();
                   }
               }

            }
        }

        System.out.println("Count is"+count);
        System.out.println("maxcount is"+maxcount);

        /* T(C) = O(N2)
        S(C) = O(1)
         */

    }

    public static int find_prefix_sum_k_maxlength_optimized(int[] arr1, int k)
    {
        int n =arr1.length;
        Map<Integer,Integer> preSumMap = new HashMap<>();
        int sum=0;
        int maxlen=0;

        //calculate the prefix sum
        for(int i=0;i<n;i++) {
            sum = sum + arr1[i];


            //case1: If prefix sum =k
            if (sum == k)
            {
                maxlen = maxlen + 1;
            }

            // Case 2: If (sum - k) was seen before
            int rem = sum - k;
            if (preSumMap.containsKey(rem))
            {
                int len = i - preSumMap.get(rem);
                maxlen = Math.max(len,maxlen);
            }

            if(!preSumMap.containsKey(rem))
            {
                preSumMap.put(sum,i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        find_subarray_with_sum_k_BF(arr1,k);
        int len =find_prefix_sum_k_maxlength_optimized(arr1,k);
        System.out.println(len);


    }
}

/*Below is a complete FAANG-style explanation for Longest Subarray with Sum = K, covering:
Brute Force
Better (Prefix Sum + HashMap)
Optimal (Two Pointers – only for positive numbers)
👉 Also includes count of subarrays and printing the subarrays
I’ll use Java and explain step-by-step.
1️⃣ Brute Force (Works for ALL numbers)
Idea
Check all subarrays
Calculate sum
If sum == K →
update longest length
increment count
print subarray
Time & Space
Time: O(N²)
Space: O(1)*/
