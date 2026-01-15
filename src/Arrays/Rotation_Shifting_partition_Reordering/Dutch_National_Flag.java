package Arrays.Rotation_Shifting_partition_Reordering;
/*7️⃣ Dutch National Flag (0s,1s,2s)

Problem Type: Partitioning
Example: [2,0,2,1,1,0]

Golden Rules Applied

✔ GR-7 → three-pointer
✔ GR-8 → order irrelevant
✔ GR-9
✔ GR-10*/



public class Dutch_National_Flag
{

        public static void reorder(int[] arr)
        {
            int low =0;
            int mid =0;
            int high = arr.length -1;

            while(mid<=high)
            {
                if(arr[mid]==0)
                {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                }

                else if(arr[mid]==1)
                {
                    mid++;
                }
                else
                {
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;

                }

        }

    }
    public static void main(String[] args)
    {
        int[] arr = {2,0,2,1,1,0};
        reorder(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }

    }
}

/*Dutch National Flag – Golden Rules (Concise Cheat Sheet)

Pointers meaning

low → next position for 0

mid → current UNPROCESSED element

high → next position for 2

Array regions

0 … low-1 → all 0s

low … mid-1 → all 1s

mid … high → unprocessed

high+1 … end → all 2s

Loop condition

while (mid <= high)

If arr[mid] == 0

swap(low, mid)

low++, mid++

✔ 0 placed correctly, safe to move both

If arr[mid] == 1

mid++

✔ Already in correct region

If arr[mid] == 2

swap(mid, high)

high--

❌ Do NOT do mid++

Why mid++ is NOT done for 2

Element swapped from high is unprocessed

Unprocessed elements always lie between mid and high

Incrementing mid would skip checking that element

Key mental rule

mid moves only when value is confirmed (0 or 1)

mid stays when value is uncertain (2)

Order

Order not required → swapping allowed

Complexity

Time: O(n)

Space: O(1)

Interview one-liner

“We don’t increment mid after handling 2 because the swapped element from high is unprocessed and must be evaluated.”*/
