package Arrays.April.Easy.fifteen;

public class maximum_consecutive_ones {
    public static int max_cons_ones(int[] arr)
    {
        int count =0, maxcount = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==1) {
                count++;
                if(count > maxcount) {
                    maxcount = count;
                }
            }
            else {
                count =0;
            }
        }

        return maxcount;
    }
    public static void main(String[] args)
    {
        int[] prices = {1, 1, 0, 1, 1, 1};
        int maxcount = max_cons_ones(prices);
        System.out.print("Maxcount is"+maxcount);

    }
}
