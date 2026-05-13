package Arrays.May.Twelve;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementInEveryWindowOfSizeK {

    public ArrayList<Integer> countDistinctElement(int[] arr, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < arr.length; right++) {

            // Add current element
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            // Window size becomes k
            if (right - left + 1 == k) {

                // Store distinct count
                result.add(map.size());

                // Reduce frequency of left element
                map.put(arr[left], map.get(arr[left]) - 1);

                // Remove if frequency becomes 0
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,1,3,4,2,3};
        int k = 4;

        CountDistinctElementInEveryWindowOfSizeK cd =
                new CountDistinctElementInEveryWindowOfSizeK();

        ArrayList<Integer> res = cd.countDistinctElement(arr, k);

        for (int num : res) {
            System.out.println(num);
        }
    }
}