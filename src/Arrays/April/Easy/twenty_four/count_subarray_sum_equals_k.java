package Arrays.April.Easy.twenty_four;
import java.util.HashMap;

public class count_subarray_sum_equals_k {
/*Input : N = 4, array[] = {3, 1, 2, 4}, k = 6
Output: 2
Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4]*/


public int count_subarray(int[] num, int target) {
    int n = num.length;
    int sum1=0, count=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    for(int i=0;i<n;i++) {
        sum1=sum1+ num[i];
        int rem = sum1 - target;

        if(map.containsKey(rem))
        {
            count = count + map.get(rem);
        }

        map.put(sum1,map.getOrDefault(sum1,0)+1);
    }
    return count;
}


    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int target=6;
        count_subarray_sum_equals_k c= new count_subarray_sum_equals_k();
        int n = c.count_subarray(arr,target);
        System.out.print("Count array is"+n);
    }
}
