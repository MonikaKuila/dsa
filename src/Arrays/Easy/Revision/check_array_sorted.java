package Arrays.Easy.Revision;

public class check_array_sorted
{
    public static boolean check_arr_sorted(int[] arr)
    {

       for(int i=1;i<arr.length;i++)
       {
           if(arr[i]<arr[i-1])
           {
              return false;

           }
       }
       return true;
    }

    public static boolean check_arr_asc_desc(int[] arr)
    {
        boolean asc = true;
        boolean desc = true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                asc = false;
            }
            else if(arr[i]>arr[i-1])
            {
                desc = false;
            }
        }

        return asc || desc;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        boolean flag = check_arr_sorted(arr);
        System.out.println("Flag is"+flag);
        boolean flag1 = check_arr_asc_desc(arr);
        System.out.println("Flag is"+flag1);

    }
}
