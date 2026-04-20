package Arrays.April.Easy.eighteen;

public class Rearrange_array_elements_by_sign {

    public static int[] rearrange_array(int[] nums) {
        int posindex = 0;
        int negindex = 1;
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[negindex] = nums[i];
                negindex+=2;
            } else {
                ans[posindex] = nums[i];
                posindex+=2;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5};
        int[] arr1 = rearrange_array(arr);
        for(int num : arr1)
        {
            System.out.print(num);
        }
    }
}
