package array;

import java.util.*;

public class NthLargest {
    public static int nthLargestElement(int []arr,int index)
    {
        int res=0,cnt=1;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(" "+arr[i]);
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(cnt==index)
           return arr[i];
           else
           cnt++;
        }
        return 0;
    }
    public static void  main(String []args)
    {   
        Scanner sc=new Scanner(System.in);
        int arr[]={10,23,3,4,32,45};
        System.out.print("Enter index : ");

        int index=sc.nextInt();
        int result= nthLargestElement(arr,index);
        System.out.println(index+"th Largest Element is :"+result);
    }
}
