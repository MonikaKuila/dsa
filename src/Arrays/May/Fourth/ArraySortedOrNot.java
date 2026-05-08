package Arrays.May.Fourth;
/*T(C) = O(N)*/
/*👉 “Find first violation”

If found → return false
If never found → return true
🧠 EVEN SIMPLER RULE

👉 “Each element should NOT be smaller than the previous”

That’s it.*/

/*Pattern : Adjacent comparison pattern

You’ll use it in:

Sorted check
Monotonic arrays
Peak element problems
Stock problems*/

public class ArraySortedOrNot {

    public static boolean arraySortedOrNot(int[] arr)
    {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for(int i=1;i< arr.length; i++) {
            if(arr[i]< arr[i-1])
            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 12, 14, 19 , 17};
        boolean isSorted = arraySortedOrNot(arr);
        System.out.println("Array sorted or not is"+ isSorted);

    }
}
