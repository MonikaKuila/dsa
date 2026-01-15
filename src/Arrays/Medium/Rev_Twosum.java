package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class Rev_Twosum
{
    public static void BruteForce(int[] arr, int target, int n)
    {

        int count =0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    count++;
                    System.out.print("Numbers are"+arr[i]+arr[j]);

                }
            }
        }


        System.out.println("count of pairs is"+count);
    }

    public static void better(int[] arr, int target, int n)
    {
////        int[] arr = {8,2,6,2,2,2};
////        int target=8;
////        int count=0;
////        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<n;i++)
        {
            int diff = target-arr[i];
            if(map.containsKey(diff))
            {
                count+=map.get(diff);
                System.out.print("Numbers are"+diff+"and" + arr[i]);

            }
              map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        System.out.print("Count is"+count);

    }

    public static void optimal(int[] arr,int target, int n)
    {
        Arrays.sort(arr);
        int left =0, right = arr.length-1, sum =0,count=0;
        while(left<right)
        {
            sum = arr[left]+ arr[right];
            if(sum == target)
            {
                count++;
                System.out.println("Pairs are"+arr[left]+ "and"+ arr[right]);
                left++;
                right--;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
             }
    }


    public static void main(String[] args)
    {
        int[] arr = {8,2,6,2,2,2};
        int target=8;
        int count=0;
        int n = arr.length;

//        BruteForce(arr,target,n);
        better(arr,target,n);
        optimal(arr,target,n);


    }



}
