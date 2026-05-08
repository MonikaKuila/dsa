package Arrays.May.Sixth;

/*🎯 Pattern Name

👉 Two Pointer – Opposite Ends

📌 Complexity
Complexity	Value
Time	O(N)
Space	O(1) ✅*/

public class TwoSumSortedArray {

    public static int[] twoSum(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        int sum=0;
        while(start<end) {
           sum=arr[start] + arr[end];
           if(sum == target)
           {
               return new int[] {start, end};
           }
           else if(sum > target)
           {
               end--;
           }
           else {
               start++;
           }

        }

        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] arr1= twoSum(arr,target);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }
}
