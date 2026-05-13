package Arrays.May.Seven;

import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharactersPrint {

    public static String find_substring(String s) {
        int left = 0;
        int maxlength = 0;
        int startIndex = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);
            if (right - left + 1 > maxlength) {
                maxlength = right - left + 1;
                startIndex = left;
            }

        }
        return s.substring(startIndex, startIndex + maxlength);
    }


    public static void main(String[] args) {
     String s = "abcccdcfgee";
     String s1 = find_substring(s);
     System.out.print("Substring is"+s1);

    }
}
