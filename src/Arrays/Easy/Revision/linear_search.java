package Arrays.Easy.Revision;

import javax.naming.Binding;
import java.lang.module.FindException;
import java.net.BindException;

public class linear_search
{

    public static int linear_search(int[] arr, int search)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == search)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr= {1, 2, 3, 4, 5};
        int search = 3;
        int pos =-1;
        pos = linear_search(arr, search);
        System.out.print("Position is"+pos);
    }
}
