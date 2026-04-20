package Arrays.April.Easy.eighteen;

import java.util.EnumSet;

public class find_next_permutation {
    public void find_next_permutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        int i;
        //Hint : largest array is {5,4,3,2,1}
        //Step 1: find the break point where arr1[i]<arr1[i+1]
        //from last find the point where arr1[i]<arr1[i+1]
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
            if (index == -1) {
                // Reverse the entire array
                reverse(arr, 0, arr.length - 1);
                return;
            }

        //Step2: Find the element which is largest from the number
        for (i = n - 1; i> index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr,i,index);
                break;
            }
        }

        //Step 3: Sort the numbers after index
        reverse(arr, index+1, arr.length-1);

    }

    public void reverse(int[] arr, int start, int end){
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    private void swap ( int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


        public static void main (String[]args)
        {
            int[] arr = {2, 1, 4, 3, 2, 1};
            find_next_permutation fnp1 = new find_next_permutation();
            fnp1.find_next_permutation(arr);
            for(int num : arr)
            {
                System.out.print(num + " ");
            }

        }
    }

