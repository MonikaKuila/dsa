package Arrays.May.Fifth;

public class moveZeroes {

    public static int[] moveZeoesToEnd(int[] arr) {
        int zeroElement = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroElement = i;
                break;
            }
        }

            if(zeroElement==-1)
            {
                return arr;
            }


        for (int j = zeroElement + 1; j < arr.length; j++) {

            if (arr[j] != 0) {
                swap(arr, zeroElement, j);
                zeroElement++;
            }
        }
        return arr;    }

    public static int[] moveZeroes(int[] arr) {
        int zeroElement = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                int temp = arr[zeroElement];
                arr[zeroElement] = arr[i];
                arr[i] = temp;
                zeroElement++;
            }
        }
        return arr;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


public static void main(String[] args) {
    int[] arr1 = {2, 3, 5, 9, 0, 1, 2, 0};
    int[] arr = {0, 1, 0, 3, 12};
//    int[] arr2 =moveZeoesToEnd(arr1);
    int[] arr2 =moveZeroes(arr1);
    for (int num : arr2) {
        System.out.println("Array is" + num);
      }
    }
}