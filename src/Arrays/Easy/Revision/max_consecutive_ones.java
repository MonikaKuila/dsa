package Arrays.Easy.Revision;

public class max_consecutive_ones
{
    public static int max_cons_ones(int[] arr)
    {
        int count=0, maxcount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                count++;
                maxcount = Math.max(count,maxcount);

            }
            else
            {
                count =0;
            }
        }

        return maxcount;
    }



    public static void main(String[] args)
    {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int maxcount = max_cons_ones(arr);
        System.out.println("Max count is"+maxcount);

    }
}
