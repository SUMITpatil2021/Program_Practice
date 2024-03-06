package basiccode;

public class Fibonacci {
		// fibo series without  resursive
	public static void main(String[] args) {
	
		int no1=0,no2=1,no3,i,cnt=10;
		System.out.print(no1+" "+no2);
		// for first 10 no. fibo series
		for(i=2;i<cnt;i++)
		{
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.print(" "+no3);
		}
		
	}

}
