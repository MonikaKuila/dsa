package Arrays.May.Tenth.SlidingWindow.FixedSum;

/*Pattern Name

👉 Fixed Size Sliding Window

Mental Model

👉

Reuse previous window result.
Generic Template
1. Build first window
2. Slide window
3. Remove left
4. Add right
5. Update answer
Window Formula

Very important:

newWindow=oldWindow−outgoing+incoming

One-line Memory Trick

👉

Subtract left, add right.*/

public class MaxSubArrayOfSizeK {

    public static int maxSubarraySum(int[] arr, int size)
    {
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;

        for(int left=0; left<=n-size;left++)
        {
            int count=0;
            int sum =0;
            while(count < size) {
                sum = sum + arr[left+count];
                count++;
            }
            if(sum>maxsum)
            {
                maxsum = sum;
            }
        }

        return maxsum;
    }

    public static int maxSubarraySumOptimal(int[] arr, int size)
    {   if(arr == null || arr.length < size) {
        return -1;
    }


        int sum1=0;
        int maxsum;
       for(int i=0;i<size;i++)
       {
           sum1 = sum1+ arr[i];
       }
       maxsum = sum1;

       for(int j=size; j<arr.length;j++)
       {
          sum1=sum1-arr[j-size] +arr[j];
          if(sum1>maxsum)
          {
              maxsum = sum1;
          }
       }

       return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int size = 3;
        int maxsum=maxSubarraySum(arr,size);
        System.out.println("Maxsum is"+maxsum);
        int maxsum1=maxSubarraySumOptimal(arr,size);
        System.out.println("Maxsum is"+maxsum1);

    }
}
