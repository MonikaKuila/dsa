package Arrays.April.Easy.nineteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leaders_in_array {

    public ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        res.add(arr[n-1]);
        for(int i=n-2;i>=0;i--) {
            if(arr[i]>max)
            {
                max = arr[i];
                res.add(arr[i]);
            }
        }
        return (res);
    }

    public static void main(String[] args){
        int[] arr = {4, 7, 1, 0};
        ArrayList<Integer> arr1 = new ArrayList<>();
        Leaders_in_array l = new Leaders_in_array();
        arr1 = l.leaders(arr);
        Collections.reverse(arr1);
        for(int a : arr1)
        {
            System.out.print(a + " ");
        }


    }
}
