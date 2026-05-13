package Arrays.May.Seven;

import java.util.HashMap;
import java.util.HashSet;

public class longestSubstringWithoutRepeatingCharacter {

    public static int longestSubstringWithoutRepeating(String s) {
       int left = 0;
       int maxlen =0;
        HashSet<Character> set = new HashSet<>();
       for(int right=0; right<s.length(); right++ )
       {
           while(set.contains(s.charAt(right)))
           {
               set.remove(s.charAt(left));
               left++;
           }
           set.add(s.charAt(right));
           maxlen = Math.max(maxlen,right-left+1);
       }
       return maxlen;
    }

    public static void main(String[] args) {
        String s  = "abcabcbb";
        int maxlen = longestSubstringWithoutRepeating(s);
        System.out.println("maxlen is"+maxlen);
    }
}
