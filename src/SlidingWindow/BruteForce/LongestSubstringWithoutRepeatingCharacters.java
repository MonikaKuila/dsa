package SlidingWindow.BruteForce;

import java.util.HashMap;

class LongestSubstringWithoutRepeatingCharacters
{
        public static int lengthOfLongestSubstring(String s)
        {
            int l = s.length();
            int maxlen = 0;

            for(int i=0;i<l;i++)
            {
                HashMap<Character,Integer> map = new HashMap<>();
                for(int j=i;j<l;j++)
                {
                    if(map.containsKey(s.charAt(j)))
                    {

                        break;
                    }
                    map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
                    maxlen = Math.max(maxlen,j-i+1);
                }
            }

            return maxlen;

        }


    public static void main(String args[])
    {
        int maxlen = lengthOfLongestSubstring("abcabcbb");
        System.out.println("Length of longest substring abcabcbb is"+ maxlen);
        maxlen = lengthOfLongestSubstring("bbbbb");
        System.out.println("Length of longest substring bbbbb is"+ maxlen);
        maxlen = lengthOfLongestSubstring("pwwkew");
        System.out.println("Length of longest substring pwwkew is"+ maxlen);
    }
   }
