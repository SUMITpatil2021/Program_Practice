package array;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,4,11,11};
    int result = second(arr);
    System.out.println(result);
    }

   /*  private static int second(int[] arr) {
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            secondLargest=largest;
            else if(arr[i]>secondLargest)
            secondLargest=arr[i];
        }
        return secondLargest; */

        private static int second(int[] arr)
        {
            int secondlargest=0;
            Arrays.sort(arr); 
            for (int i = 0, j = arr.length - 1, tmp; i < j; i++, j--) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            } 

            for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");    
             
            for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
              secondlargest=arr[i];
              break;
               
            }
        }

        return secondlargest;

        }


    
    }

