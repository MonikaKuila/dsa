package Arrays.Easy.Revision;

public class num_appears_once_others_appears_twice
{
    public static int find_num_appears_once(int[] arr)
    {
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            xor = xor^arr[i];
        }

        return xor;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,2,1};
        int res = find_num_appears_once(arr);
        System.out.println("Result is"+res);
    }
}
