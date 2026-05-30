package Arrays.May.Tenth.SlidingWindow.FixedSum.Nineteen;

import java.util.ArrayList;

public class FindAnagramsInString {

    public ArrayList<Integer> findAnagram(String s,  String p)
    {
        int start = 0;
        int count =0;

        ArrayList<Integer> result = new ArrayList<>();

        if(s==null || s.length()<p.length())
        {
            return new ArrayList<>(-1);
        }
        for(int end =0; end<s.length(); end++)
        {
           if(s.charAt(end)=='a' || s.charAt(end)=='b' || s.charAt(end)=='c')
           {
               count++;
               if(end-start+1 == p.length())
               {
                   if(count == p.length()) {
                       result.add(start);

                   }
                   start ++;
               }
           }
           else {
               count =0;
           }
        }
        return result;
    }

    public static void main(String[] args)
    {


        String s = "cbaebabacd";
        String p ="abc";
        FindAnagramsInString anagramsInString = new FindAnagramsInString();
        ArrayList<Integer> result = anagramsInString.findAnagram(s,p);
        for(int i=0;i<result.size();i++)
        {
            System.out.println("ArrayList size is"+ result.get(i));
        }
    }
}
