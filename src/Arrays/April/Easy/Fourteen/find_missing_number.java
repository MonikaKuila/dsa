package Arrays.April.Easy.Fourteen;

public class find_missing_number {
    public static int find_missing_num(int[] arr1)
    {
        int n = arr1.length+1;
        int sum =0,sumn=0;
        for(int i=0;i<arr1.length; i++) {
          sum = sum + arr1[i];
        }
        sumn = n*(n+1)/2;
        return sumn-sum;

    }

    public static int find_missing_number_xor(int[] arr1)
    {
        int xor1=0, xor2=0;
        int n = arr1.length+1;
        for(int i=1;i<=n;i++) {
            xor1=xor1^i;
        }

        for(int i=0; i<n-1;i++) {
            xor2 = xor2^arr1[i];
        }

        return xor1^xor2;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 5, 6};
        int missingnum = find_missing_num(arr);
        System.out.print("missing num is"+ missingnum);

        int mn = find_missing_number_xor(arr);
        System.out.print("missing num is"+ mn);

    }
}
