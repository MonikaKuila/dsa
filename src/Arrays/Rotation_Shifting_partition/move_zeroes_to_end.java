package Arrays.Rotation_Shifting_partition;

/*Problem Type: Partitioning
Example: [0,1,0,3,12] → [1,3,12,0,0]

Golden Rules Applied

✔ GR-7 → two-pointer
✔ GR-8 → order preserved
✔ GR-9
        ✔ GR-10

        📌 No overwrite risk → direction rule not needed*/

/*✅ Golden Rules — VERIFIED
✔ GR-7 → Two-pointer

Correct.
We use:

i → scan pointer

pos → position for next non-zero

✔ GR-8 → Order preserved

Correct.
Non-zero elements remain in original relative order.

✔ GR-9 → Dry run

Correct.
Always dry-run small input to prove stability.

✔ GR-10 → Complexity

Correct.

Time:  O(n)
Space: O(1)*/

public class move_zeroes_to_end
{
    public static void move_zeroes_to_end(int[] arr)
    {
        int n = arr.length;
        int pos = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                pos = i;
                break;
            }
        }

        for(int i=pos+1;i<n;i++)
        {
           if(arr[i]!=0)
           {
               int temp = arr[pos];
               arr[pos] = arr[i];
               arr[i] = temp;
               pos++;

           }
        }



    }

    public static void main(String[] args)
    {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        move_zeroes_to_end(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
