package SlidingWindow.Optimized;

import java.util.Arrays;
import java.util.HashMap;

public class Longestsubstr {


  public static int Optimized_longestSubstringWithoutRepeatingCharactes(String s)
        {
            // Assuming standard ASCII characters (0–127)
            int[] lastIndex = new int[128];
            Arrays.fill(lastIndex, -1);  // Initialize all indices as unseen

            int left = 0, maxlen = 0;

            for (int right = 0; right < s.length(); right++) {
                char ch = s.charAt(right);

                // If this character was seen and is inside the current window
                if (lastIndex[ch] >= left) {
                    // Move 'left' pointer to one past the previous occurrence
                    left = lastIndex[ch] + 1;
                }

                // Update the last index of the character
                lastIndex[ch] = right;

                // Calculate window size
                maxlen = Math.max(maxlen, right - left + 1);
            }

            return maxlen;
        }


        public static void main(String args[])
        {
            int maxlen = Optimized_longestSubstringWithoutRepeatingCharactes("abcabcbb");
            System.out.println("Length of longest substring abcabcbb is"+ maxlen);
            maxlen = Optimized_longestSubstringWithoutRepeatingCharactes("bbbbb");
            System.out.println("Length of longest substring bbbbb is"+ maxlen);
            maxlen = Optimized_longestSubstringWithoutRepeatingCharactes("pwwkew");
            System.out.println("Length of longest substring pwwkew is"+ maxlen);


        }
    }


