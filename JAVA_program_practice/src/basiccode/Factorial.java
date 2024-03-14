package basiccode;
import java.util.*;
		

public class Factorial {
// Using simple for loop 
//	public static int factorial(int num)
//	{
//		int fact=1;
//		
//		for(int i=1;i<=num;i++)
//		{
//			fact*=i;
//		}
//		return fact;
//	}
	
// using recursive function 
	public static int factorial(int num )
	{
		if(num>=1)
			return num*factorial(num-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int fact=factorial( num);
		System.out.println("Factorial of "+num +" is : "+fact);
			

	}

}
