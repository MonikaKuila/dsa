package Arrays.Medium.Revision;

import java.util.Arrays;

public class Twosum
{

    public static int[] two_sum(int[] arr,int target) {
        int n = arr.length;
        int[][] numswWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            numswWithIndex[i][0] = arr[i];
            numswWithIndex[i][1] = i;
        }
        Arrays.sort(numswWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = numswWithIndex[left][0] + numswWithIndex[right][0];
            if (sum == target) {
                return new int[]{numswWithIndex[left][1], numswWithIndex[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args)
    {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] res =two_sum(arr,target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
