package Arrays.April.Easy.twenty;

import java.util.HashSet;

public class longest_consecutive_sequence {
    public int longest_consecutive_sequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;

        for (int num : arr) {
            set.add(num);
        }
        for (int st : set) {

            if (!set.contains(st - 1)) {
                int cnt = 1;
                int x = st;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
      return longest;

    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        longest_consecutive_sequence l = new  longest_consecutive_sequence();
        int longest = l.longest_consecutive_sequence(arr);
        System.out.print("longest consecutive sequence is"+ longest);

    }
}
