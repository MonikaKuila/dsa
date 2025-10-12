package SlidingWindow.Optimal;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters
{
    public static int Optimal_longestSubstringWithoutRepeatingCharactes(String str)
    {
        int len = str.length();
        int left = 0, maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < len; right++) {
            char ch = str.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            maxlen = Math.max(maxlen, right - left + 1);

        }
        return maxlen;
    }

    public static void main(String args[])
    {
        int maxlen = Optimal_longestSubstringWithoutRepeatingCharactes("abcabcbb");
        System.out.println("Length of longest substring abcabcbb is"+ maxlen);
        maxlen = Optimal_longestSubstringWithoutRepeatingCharactes("bbbbb");
        System.out.println("Length of longest substring bbbbb is"+ maxlen);
        maxlen = Optimal_longestSubstringWithoutRepeatingCharactes("pwwkew");
        System.out.println("Length of longest substring pwwkew is"+ maxlen);


    }
}
