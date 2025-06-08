package Arrays.Easy;

public class LinearSearch
{
    public static int getindex(int[] arr, int ele)
    {
        int i,pos=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] == ele)
            {
               pos = i;
               break;
            }
        }
        return pos;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,5,7,6,5,9};
        int ele =5;
        System.out.println("Linear Search : Element"+ ele+ "is present at position" + getindex(arr, ele));
    }
}
