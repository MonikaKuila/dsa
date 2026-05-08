package Arrays.May.Fourth;

/* Please note to take care of edge cases like array is null and length is <2 immediately return
@nd largest and largest should have different values not same
t(c) = O(n) and s(c) = O(1)
 */

/*🔥 Core Insight (VERY IMPORTANT)

👉 largest must be a valid array value
👉 secondLargest must be a placeholder initially

🧠 Mental Model (remember this)
First variable → real value
Second variable → candidate value*/

public class SecondLargestElement {
    public static int secondLargest(int[] arr)
    {
        if(arr == null || arr.length <2)
        {
            return -1;
        }
        int largest = arr[0], secondLargest = Integer.MIN_VALUE;
        for(int i=1; i< arr.length ; i++) {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }

            else if(arr[i]<largest && arr[i]>secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

       return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {10,-20,35,-46,50};
        int[] arr1 = {5,5,5,5,5,5};
        int [] arr2 = {5};
        int num = secondLargest(arr);
        System.out.println("Second largest is"+num);
    }
}
