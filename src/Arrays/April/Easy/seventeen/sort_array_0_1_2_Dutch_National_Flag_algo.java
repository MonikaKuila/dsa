package Arrays.April.Easy.seventeen;

public class sort_array_0_1_2_Dutch_National_Flag_algo {

    public static int[] sort_array(int[] arr) {
        int n = arr.length;
        int low =0, mid =0, high = n-1;
        while(mid<=high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }



            else if(arr[mid] ==1)
            {
                mid ++;
            }

            else if(arr[mid]==2)
            {
                int temp = arr[mid];
                arr[mid]= arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for(int num : arr) {
            System.out.print(num);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sort_array(nums);
    }
}
