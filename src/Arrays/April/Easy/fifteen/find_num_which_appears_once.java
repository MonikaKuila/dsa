package Arrays.April.Easy.fifteen;

public class find_num_which_appears_once {
    public static int find_num_which_appears_once(int[] arr) {
        int xor1 = 0;
        for(int i=0;i<arr.length;i++) {
          xor1 = xor1 ^ arr[i];
        }
        return xor1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int num_with_freq_once = find_num_which_appears_once(arr);
        System.out.print("Number with frequency once is"+ num_with_freq_once);

    }
}
