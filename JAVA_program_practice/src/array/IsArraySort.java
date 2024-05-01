package array;

public class IsArraySort {
    public static int isSort(int []arr)
    {
        int res=0;
        for(int i=0;i<=arr.length-2;i++)
        {
            if(arr[i]>arr[i+1])
            {
            res=-1;
            break;
            }
            else
            {
                res=1;
            }

        }
        return res;
    }
    public static void main(String []args)
    {
        int arr[]={50,40,30,20,10};
        int res=isSort(arr);
        if(res==1)
        System.out.println("Array is in  ascending order");
        else
        System.out.println("Array is Not in sorted Order");

    }
}
