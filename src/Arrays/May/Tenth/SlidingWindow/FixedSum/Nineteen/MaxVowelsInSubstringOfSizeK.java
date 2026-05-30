package Arrays.May.Tenth.SlidingWindow.FixedSum.Nineteen;

public class MaxVowelsInSubstringOfSizeK {

     int count =0;
    int start = 0;
    int maxCount = 0;


    public  int maxVowels(String s,int k)
    {
        if(s==null || s.length()<k)
        {
            return -1;
        }
        for(int end=0;end<s.length();end++)
        {
            char ch = s.charAt(end);
            if(isVowel(ch))
            {
                count ++;

            }

            if(end-start+1==k)
            {
                maxCount = Math.max(count,maxCount);
                if(isVowel(s.charAt(start)))
                {
                   count = count -1;
                }
                start++;
            }
        }
        return maxCount;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args)
    {
        String s = "abciiidef";
        int k =3;
        MaxVowelsInSubstringOfSizeK maxVowelsInSubstringOfSizeK = new MaxVowelsInSubstringOfSizeK();
        int maxCount = maxVowelsInSubstringOfSizeK.maxVowels(s,k);
        System.out.println("Maxcount is"+maxCount);

    }
}
