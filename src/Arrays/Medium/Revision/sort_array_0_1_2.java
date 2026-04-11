package Arrays.Medium.Revision;

import java.util.EnumSet;

public class sort_array_0_1_2
{
    public static void sort_array(int[] num)
    {
        int n = num.length;
        int left=0, right = n-1, mid = 0;
        while(mid<right)
        {
            if(num[mid]==0)
            {
                swap(num, left,mid);
                left++;
                mid++;
            }
            else if(num[mid]==2)
            {
                swap(num,mid, right);
                right--;
               
            }
            else {
                mid++;
            }
        }

        for(int i = 0;i<n;i++)
        {
            System.out.print(num[i]);
        }
    }

    public static void swap(int[] num,int i, int j)
    {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] num = {1, 0, 2, 1, 0};
        sort_array(num);
    }
}
