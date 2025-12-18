package Arrays.Practice.Easy;

import static Arrays.Practice.Easy.left_rotate_element_by_one_place.left_rotate;

public class left_rotate_element {

    public static int[] left_rotate_element_by_many_place(int[] arr, int k)
    {
      int[] temp = new int[k];
      int n = arr.length;
      for(int i=0;i<k;i++)
      {
          temp[i] = arr[i];
      }

      for(int i=k;i<n ;i++)
      {
          arr[i-k]=arr[i];
      }

      int j=0;

      for(int i=n-k;i<n;i++)
      {
          arr[i] = temp[j];
          j++;
      }

      return arr;

    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 9, 1, 5, 8};
        int k = 4;

        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        left_rotate_element_by_many_place(arr, k);

        System.out.println("After left rotating an array");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }

    }
}
