package TwoPointers.Easy;

import java.util.HashMap;

public class TwoSum
{
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/
    public static int[] twosum_bruteforce(int[] arr, int target)
    {
        int[] result = new int[2];
        for(int i=0; i< arr.length; i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }
        }
        return result;
    }


    public static int[] twosum_optimal(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (map.containsKey(rem)) {
//                return new int[]{map.get(rem), i};
                result[0] = i;
                result[1] = map.get(rem);
                return result;
            } else {
                map.put(arr[i], i);
            }
        }
//        return new int[]{-1, -1};
        return result;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,7,11,15};
        int target = 9;

//        int[] result = twosum_bruteforce(arr, target);
//        for(int i=0;i<result.length;i++)
//        {
//            System.out.println(result[i]);
//        }

        int[] result = twosum_optimal(arr, target);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }


    }
}
