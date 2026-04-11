package Arrays.April.Easy.eleven;

import java.util.Arrays;

public class Sorted_NotSorted {


    public static boolean check_sorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5,1};
      boolean isSorted = check_sorted(arr);
      System.out.println("Sorted array is"+ isSorted);
    }
}
