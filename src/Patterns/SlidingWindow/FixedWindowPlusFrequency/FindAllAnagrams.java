package Patterns.SlidingWindow.FixedWindowPlusFrequency;
/*Problem Statement

Given two strings s and p, return a list of all starting indices of p's anagrams in s.

An anagram is a word or phrase formed by rearranging the letters of another word, using all the original letters exactly once.

Return the indices in any order.*/
/*s = "cbaebabacd"
p = "abc"*/


import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

    public List<Integer> findAnagram(String s,  String p)
    {
        //store frequency array
        int[] freq = new int[26];
        List<Integer> result = new ArrayList<>();
        if(p.length()==0 || s.length()==0 || p.length()>s.length())
        {
           return new ArrayList<>();
        }
        for(int i=0;i<p.length();i++)
        {
            freq[p.charAt(i) - 'a']++;
        }

        //iterate through string
        int start = 0; int count =p.length();
        for(int end=0; end<s.length(); end++)
        {
            //check incoming character
            char c = s.charAt(end);
            if(freq[c-'a']>0)
            {
                count--;
            }
            freq[c-'a']--;

            if(end-start+1==p.length())
            {
                if(count==0)
                {
                    result.add(start);
                }
                char outgoing = s.charAt(start);
                if(freq[outgoing - 'a']>=0)
                {
                    count ++;
                }
                freq[outgoing-'a']++;
                start++;
            }


        }

        return result;
    }

    public static void main(String[] args)
    {
        String s = "cbaebabacd";
        String p = "abc";
        FindAllAnagrams a = new FindAllAnagrams();
        List<Integer> l = a.findAnagram(s,p);
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i));
        }

    }
}
