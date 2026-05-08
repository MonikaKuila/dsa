/*----------Largest element in array*********************/
/* T(C) -------- O(N)
   S(C)----------O(1)
   Hint : initial max should be arr[0] NOT Integer.MIN because it will avoid unnecessary comparison
   Hint : Edge cases if array is empty then throw error*/

/*“I initialize the largest with the first element to handle negative values correctly.
Then I iterate from index 1 to avoid comparing the element with itself.
Time complexity is O(N), space complexity is O(1).”*/

/*Handle edge cases immediately and exit early instead of nesting logic.*/

package Arrays.May.Fourth;

public class LargestElement {

    public static void main (String[] args) {
        int[] arr = {10, 27, 19, 36, 5, 9};
        int[] arr1 = {-10, -9, -19, -10, -25};
        System.out.println("Initial Array is");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("largest value is "+findLargestElement(arr));
        System.out.println("Initial Array is");
        for(int i : arr1)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("largest value is "+ findLargestElement(arr1));
    }

    private static int findLargestElement(int[] arr) {
        if(arr==null || arr.length==0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int largest =arr[0];
        for(int i=1;i<arr.length;i++)
//        for(int num : arr)
        {
            if(arr[i] >largest)
                largest = arr[i];
        }

        return largest;
    }
}

