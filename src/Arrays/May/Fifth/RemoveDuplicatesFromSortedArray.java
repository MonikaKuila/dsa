/*Remove Duplicates from Sorted Array
[1,1,2,2,3,3] → [1,2,3,_ ,_ ,_]
 */

/*🎯 Pattern Name
👉 Two Pointer – Read/Write (Slow–Fast) / In-place Compaction

🧠 Mental Model
👉 “Scan with fast pointer, build unique array with slow pointer”

OR even simpler
👉 “Keep writing only new values forward”

👀 Visual Thinking
[ unique | duplicates / unprocessed ]
   i           j
i → last unique element index (write pointer)
j → scanning pointer (read pointer)*/
package Arrays.May.Fifth;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicatesFromSortedArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int i = 0; //last unique element
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }



public static void main(String[] args) {
    int[] arr = {1,1,1,2,2,2,3,3};
    int[] arr1 = {1,2,3,4,4,4,5};
    int len = removeDuplicatesFromSortedArray(arr);
    for(int k= 0;k<len; k++) {
        System.out.print(arr[k]+" ");
    }

}
}
