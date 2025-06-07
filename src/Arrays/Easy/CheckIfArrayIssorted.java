package Arrays.Easy;

public class CheckIfArrayIssorted
{
    public static boolean isArraySorted(int[] arr)
    {
        int i =0;
        int j = arr.length-1;
        boolean flag = true;
        while(i<j)
        {
            int low = arr[i];
            int high = arr[i+1];

            if(low< high)
            {
                i++;
            }
            else
            {
                flag = false;
                break;
            }

        }

        return flag;
    }

    public static boolean printArray(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]);
       }


        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = {12,56,32,99,45};
        int[] arr1 = {12,13,14,45,96};
        System.out.println(printArray(arr));
        System.out.println("Is Array sorted " + isArraySorted(arr));
        System.out.println();
        System.out.println(printArray(arr1));
        System.out.println("Is Array sorted " + isArraySorted(arr1));
        System.out.println();


    }
}
