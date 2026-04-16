package Arrays.April.Easy.sixteen;

import java.util.HashMap;

public class Two_sum {
    public static void main(String[] args) {
      int[] arr = {2,6,5,8,11};
      int target = 14;
      int[] res = two_sum_pairs(arr, target);
        if(res.length == 0 || res[0] == -1) {
            System.out.println("No pair found");
        }
      System.out.print("Arrays positions are");
      for(int i=0;i<res.length; i++)
       {
           System.out.print(res[i] +"\n");
       }
    }

    private static int[] two_sum_pairs(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<n;i++) {
            int rem = target - arr[i];
            //if map.contains rem, return
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem),i};
            }
            //if first time, store it
            map.put(arr[i], i);
        }
         return new int[]{-1,-1};
        }

}
