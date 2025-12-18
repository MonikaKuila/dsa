package Arrays.Practice.Easy;

public class right_rotate
{

    public static void right_rotate_element_by_many_place(int[] arr, int k)
    {
        int[] temp = new int[k];
        int n = arr.length;
        k=k%n;

        for (int i = n-k; i<n; i++)
        {
             temp[i-(n-k)] = arr[i];
        }


        for(int i=n-k-1;i>=0;i--)
        {
            arr[i+k] = arr[i];

        }

        for(int i =0;i<k;i++)
        {
           arr[i]=temp[i];
        }

        
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 9, 1, 5, 8, 10};
        int k = 4;

        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        right_rotate_element_by_many_place(arr, k);

        System.out.println("After left rotating an array");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }

    }
}
