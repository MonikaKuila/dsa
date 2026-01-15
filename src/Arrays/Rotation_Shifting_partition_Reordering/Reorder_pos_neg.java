package Arrays.Rotation_Shifting_partition_Reordering;

import java.util.ArrayList;
import java.util.List;
/*Golden Rules Applied

✔ GR-2 → same array
✔ GR-6 → temp or careful swaps
✔ GR-8 → order matters (often asked)
✔ GR-9
✔ GR-10*/

public class Reorder_pos_neg
{
    public static void reoder_pos_neg(int[] arr)
    {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        //Separate positives and negatives
        for(int n : arr)
        {
            if(n>0)
            {
                pos.add(n);

            }
            else
            {
                neg.add(n);
            }
        }

        int p=0,n=0,i=0;

        //Fill all common elements alternatively
        while(p<pos.size() && n<neg.size())
        {
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(n++);
        }

        //Fill left over only positive elements
        while(p<pos.size())
        {
            arr[i++] = pos.get(p++);
        }
        //Fill left over only negative elements
        while(n<neg.size())
        {
            arr[i++] = neg.get(n++);
        }

    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        reoder_pos_neg(arr);
        for (int n : arr) {
            System.out.print(n);
        }
    }


}
