package Arrays.Rotation_Shifting_partition;

public class Reverse_an_array
{


           public static void reverse(int[] arr)
           {
               int left=0;
               int right = arr.length-1;
               while(left<right)
               {
                   int temp = arr[left];
                   arr[left] = arr[right];
                   arr[right] = temp;

                   left++;
                   right--;
               }
           }

           /*Time:  O(n)
             Space: O(1)*/

            public static void main(String[] args)
            {

                int[] arr1 = {1,3,4,5,6};
                System.out.println("Original array is");
                for(int i=0;i<arr1.length;i++)
                {
                    System.out.print(arr1[i]);
                }

                reverse(arr1);

                System.out.println("Reversed array is");
                for(int i=0;i<arr1.length;i++)
                {
                    System.out.print(arr1[i]);
                }



                //1.Java does NOT have Arrays.reverse()
                //Collections.reverse(Arrays.asList(arr)); works only for wrapper/object arrays
                //✔ Works ONLY for wrapper / object arrays
                //❌ Does NOT work for int[], char[], etc.
                //❌ This Will NOT Work (Primitive Array Trap)
                //Arrays.asList(arr) → List<int[]> (single element)
                /*Q: Why doesn’t Collections.reverse(Arrays.asList(arr)) work for int[]?

                A (Perfect):

                Because Arrays.asList() treats a primitive array as a single element, resulting in a List<int[]> instead of List<Integer>.

                🔑 Summary Table
                Array Type	Works with Collections.reverse()
                int[]	❌ No
                Integer[]	✅ Yes
                String[]	✅ Yes
                🏆 Final Interview Line (Memorize)

                “Java has no built-in reverse for primitive arrays; the correct approach is two-pointer swapping.”*/

            }
}
