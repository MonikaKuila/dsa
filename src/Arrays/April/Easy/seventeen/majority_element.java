package Arrays.April.Easy.seventeen;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.EnumSet;

public class majority_element {

    public static int majority_element(int[] arr) {

        int count = 0;
        int ele = 0;
        int n = arr.length;
        for(int i=0;i<n;i++) {
            if(count ==0) {
                ele = arr[i];
                 count = count + 1;
            }
            else if(arr[i]==ele) {
                count++;
            }
            else
            {
                count--;
            }

        }
        int count1=0;
        for(int i=0;i<n; i++) {

            if(arr[i]==ele)
            {
                count1++;
            }
        }

        if(count1>(n/2))
        {
            return ele;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int maj_ele =majority_element(arr);
        System.out.print("Majority Element is"+maj_ele);

    }
}
