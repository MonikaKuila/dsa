package SlidingWindow.Optimal;

public class LongestRepeatingCharacterReplacemment
{

        public static int characterReplacement(String s, int k)
        {
            int left = 0;
            int freq[] = new int[26];
            int maxfreq=0,maxlen=0;
            for(int right=0;right<s.length();right++)
            {
                freq[s.charAt(right)-'A']++;

                maxfreq = Math.max(maxfreq,freq[s.charAt(right)-'A']);



                while( (right-left+1)-maxfreq>k)
                {
                    freq[s.charAt(left)-'A']--;
                    left = left+1;
                }
                maxlen =Math.max(maxlen,right-left+1);
            }


            return maxlen;
        }

public static void main(String args[])
{
    int maxlen = characterReplacement("ABAB",2);
    System.out.println("Length of longest substring ABAB is"+ maxlen);
    maxlen = characterReplacement("AABABBA",1);
    System.out.println("Length of longest substring AABABBA is"+ maxlen);

}
}
