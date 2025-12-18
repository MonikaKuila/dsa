package Arrays.Rotation_Shifting_partition;

public class Insert_Element_at_given_index
{

    /*Golden Rules Applied

✔ GR-2 → overlap
✔ GR-3 → shift right → backward loop
✔ GR-6 → no temp needed
✔ GR-9
        ✔ GR-10*/
    public static void insert_ele(int[] arr, int pos, int ele)
    {
        //GR2: Overlap-yes
        //GR3: Shift element by 1 places right -> shift right-> backward loop i--
        int n =arr.length;
        int[] arr1 = new int[n+1];
        for(int i=n-1;i>=pos;i--)
        {
           arr1[i+1] =arr[i];
        }

        arr1[pos] = ele;

        for(int i=0;i<pos;i++)
        {
            arr1[i] = arr[i];
        }

        for(int i=0;i<arr1.length;i++)
        {
           System.out.print(arr1[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        int pos = 2;
        int ele_to_be_inserted = 9;
        int n = arr1.length;
        //Final arr = {1,2,9,3,4,5}

        insert_ele(arr1,pos,ele_to_be_inserted);


    }
}
