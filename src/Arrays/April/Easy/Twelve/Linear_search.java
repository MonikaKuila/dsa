package Arrays.April.Easy.Twelve;

public class Linear_search
{
    public static int linear_search(int[] arr, int searchitem)
    {
        int pos =-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==searchitem)
            {
                pos = i;
                return pos;
            }
        }
        return pos;
    }

    public static void main(String[] args)
    {
        int[] arr = {12, 41, 35, 16, 19, 39};
        int searchitem = 19;
        int pos = linear_search(arr,searchitem);
        System.out.println("Position is"+pos);

        
    }
}
