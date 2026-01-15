package Arrays.Rotation_Shifting_partition_Reordering;

/*6️⃣ Segregate Even and Odd Numbers

Problem Type: Partitioning
Example: [3,1,2,4] → [2,4,3,1]

Golden Rules Applied

✔ GR-7
        ✔ GR-8 → order NOT required
✔ GR-9
        ✔ GR-10*/

public class Segregate_even_odd_numbers
{
    public static void segregate_even_odd(int[] arr)
    {
        int left = 0, right = arr.length-1;
        while(left<right)
        {
            if(arr[left]%2==0)
            {
                left++;

            }
            else if(arr[right]%2!=0)
            {
                right--;
            }
            else
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            }

        }
        


    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        segregate_even_odd(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }






}
