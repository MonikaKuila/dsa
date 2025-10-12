package SlidingWindow.BruteForce;

public class LongestRepeatingCharacterReplacement
{
     public static int characterReplacement(String s, int k)
        {
            // Variable to track the maximum valid substring length
            int maxLength = 0;

            // Outer loop to iterate through all starting indices
            for (int i = 0; i < s.length(); i++) {

                // Frequency array to store counts of each uppercase letter
                int[] freq = new int[26];

                // Variable to track the max frequency character in the current window
                int maxFreq = 0;

                // Inner loop to check substrings starting at i
                for (int j = i; j < s.length(); j++) {

                    // Increase frequency of current character
                    freq[s.charAt(j) - 'A']++;

                    // Update most frequent character count in window
                    maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

                    // Current window size
                    int windowSize = j - i + 1;

                    // Calculate replacements needed to make all characters same
                    int replacements = windowSize - maxFreq;

                    // If replacements are within k, update maxLength
                    if (replacements <= k) {
                        maxLength = Math.max(maxLength, windowSize);
                    }
                }
            }

            return maxLength;
        }

public static void main(String args[])
{
    int maxlen = characterReplacement("ABAB",2);
    System.out.println("Length of longest substring ABAB is"+ maxlen);
    maxlen = characterReplacement("AABABBA",1);
    System.out.println("Length of longest substring AABABBA is"+ maxlen);

}


}
