package Arrays.April.Easy.eleven;

public class Largest_element {

    public static void largest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int pos = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                pos = i;
            }
        }
        System.out.println("largest number is" + largest + "position is" + pos);
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 7, 7, 27, -27};
        largest(arr);
    }
}
