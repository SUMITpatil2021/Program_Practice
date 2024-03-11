package basiccode;
import java.util.*;
import java.lang.*;
public class MinDistencePerfectSquare {

	public static void main(String []args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int ans=minDiff(num);
		System.out.println(ans);	
	}

	private static int minDiff(int num) {
	int i=1;
	for(i=1;i<num;i++)
	{
		if((i*i)>num)
			break;
	}
	int a=num-((i-1)*(i-1));
	int b=(i*i)-num;
	if(a<b)
		return a;
	else
		return b;
	}
}
