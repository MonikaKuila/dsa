package Arrays.May.Tenth.SlidingWindow.FixedSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeIntegerinEveryWindowofSizeK {


    public ArrayList<Integer> firstNegativeElementinEveryWindow(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int left = 0;
        for (int right = 0; right < arr.length; right++) {

            if (arr[right] < 0) {
                queue.offer(arr[right]);
            }

            if (right - left + 1 == k) {
                if (queue.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(queue.peek());
                }
                if (!queue.isEmpty() && queue.peek() == arr[left]) {
                    queue.poll();
                }

                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k =3;
        FirstNegativeIntegerinEveryWindowofSizeK ele = new  FirstNegativeIntegerinEveryWindowofSizeK();
        List<Integer> list =ele.firstNegativeElementinEveryWindow(arr,k);
        System.out.println(list);
    }
}
