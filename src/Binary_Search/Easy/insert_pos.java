package Binary_Search.Easy;

public class insert_pos
{
    public static int insert_pos(int[] arr, int x) {
        int low = 0;
        int n = arr.length;
        int high = n - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,4,7};
        int x =6;
        int ans = insert_pos(arr,x);
        System.out.println("Answer is"+ans);

    }
}
