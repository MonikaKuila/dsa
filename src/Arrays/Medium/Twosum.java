 package Arrays.Medium;

 import java.util.Arrays;
 import java.util.HashMap;

 public class Twosum
    {

        public String checkTwoSumExists_BF(int[] arr, int target)
        {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        return "YES";

                    }
                }
            }

            return "NO";
        }

        public String checkTwoSumExists_Better(int[] arr,int target)
        {
            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i=0;i<arr.length; i++)
            {
                int complement = target - arr[i];
                if(map.containsKey(complement))
                {
                    return "Yes";
                }
                map.put(arr[i],i);

            }

            return "No";
        }

        public String checkTwoSumExists_Optimal(int[] arr, int target)
        {
            int n = arr.length;
            int[][] numsWithIndex = new int[n][2];

            // Store each element with its original index
            for(int i=0;i<n;i++)
            {
                numsWithIndex[i][0] = arr[i];
                numsWithIndex[i][1] = i;
            }
            //sort an array
            Arrays.sort(numsWithIndex, (a,b) ->Integer.compare(a[0],b[0]));

            //Initialize two pointers, one at start and one at end
            int left=0,right = n-1;
            while(left<right)
            {
                int sum = numsWithIndex[left][0] + numsWithIndex[right][0];
                if(sum == target)
                {
                    return "Yes";
                } else if (sum<=target)
                {
                    left++;
                }
                else
                {
                    right--;
                }

            }

            return "No";

        }

        public static void main(String[] args)
        {
            Twosum ts = new Twosum();
            int[] arr = {2, 6, 5, 8, 11};
            int target = 14;
            System.out.println("BruteForce Approach");
            String s =ts.checkTwoSumExists_BF(arr,target);
            System.out.println(s);
            System.out.println("Better Approach");
            s=ts.checkTwoSumExists_Better(arr,target);
            System.out.println(s);
            System.out.println("Optimal Approach");
            s = ts.checkTwoSumExists_Optimal(arr,target);
            System.out.println(s);
        }
    }


