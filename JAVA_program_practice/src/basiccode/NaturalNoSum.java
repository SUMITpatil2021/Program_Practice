package basiccode;
import java.util.*;


public class NaturalNoSum {
// Using simple for loop
//public static int sumNatural(int num)
//{
//	int sum=0;
//	for(int i=1;i<=num;i++)
//		sum+=i;
//	return sum;
//}
	
	// using recurion 
	
	public static int sumNatural(int num)
	{
		if(num!=0)
			return num+sumNatural(num-1);
		else
			return num;
	}
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number : ");
	int num=sc.nextInt();
	int sum=sumNatural(num);
	System.out.println("Sum of first "+num+" numbers  is : "+sum );
	
}
}
