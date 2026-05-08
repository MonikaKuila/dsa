/*Given an integer array arr of size n and an integer k, rotate the array to the right by k places.

The rotation should be done in-place if possible.*/
/*Input:
arr = [1,2,3,4,5,6,7]
k = 3*/
/*Output:
[5,6,7,1,2,3,4]
Better:
T(C) = O(N)
S(C) = O(N)
Optimal:
T(C) = O(N)
S(C) = O(1)
*/
package Arrays.May.Fifth;

public class RotateAnArrayRightByKPlaces {

    public static int[] rightRotateElementByKPlacesBetter(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int n = arr.length;
        k = k % n;

        if (k == 0) {
            return arr;
        }

        int[] temp = new int[n - k];

        for (int i = 0; i < n - k; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = arr[n - k + i];
        }

        int j = 0;
        for (int i = k; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }

        return arr;
    }

    public static int[] reversalAlgorithmOptimal(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int n = arr.length;
        k = k % n;

        if (k == 0) {
            return arr;
        }

        k =k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        return arr;

    }

    public static void reverse(int[] arr, int start, int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6,7};
      int k =3;
      int[] arr1 = rightRotateElementByKPlacesBetter(arr,k);
      for(int num : arr1) {
          System.out.print(num);
      }
      int[] arr3 = reversalAlgorithmOptimal(arr2,k);
        for(int num : arr3) {
            System.out.print(num);
        }

    }
}
