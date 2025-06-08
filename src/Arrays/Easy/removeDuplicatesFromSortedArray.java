package Arrays.Easy;

public class removeDuplicatesFromSortedArray {
    /* Given an integer array sorted in non-decreasing order,
    remove the duplicates in place such that each unique element appears only once.
     The relative order of the elements should be kept the same.*/
    public static void main(String[] args) {
        int[] arr = {12, 12, 34, 34, 34, 45};
        System.out.println("Original array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        int k = remove_duplicates_sorted_array(arr);
        System.out.println("Array after removing duplicates is");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]);
        }
    }

    private static int remove_duplicates_sorted_array(int[] arr)
    {
        int i=0, j;
        for (j = 1; j < arr.length; j++)
        {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;
    }
}
