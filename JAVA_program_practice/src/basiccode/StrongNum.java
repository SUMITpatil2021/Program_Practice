package basiccode;
import java.util.*;
import java.lang.*;


public class StrongNum {
	public static int fact(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact*=n;
			n--;
		}
		return fact;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			int r=num%10;
			sum+=fact(r);
			num/=10;
		}
		if(sum==temp)
			System.out.println("Number is Strong Number ");
		else
			System.out.println("Number is Not Strong number ");
	}
}
