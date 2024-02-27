package basiccode;

public class FiboRecursive {

	public static int no1=0,no2=1,no3=0;
	public static void printFibo(int cnt)
	{
		if(cnt>0)
		{
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.print(" "+no3);
			printFibo(cnt-1);
		}
	}
	public static void main(String[] args) {
		int cnt=10;
		System.out.print(no1+" "+no2);
		printFibo(cnt-2);
	}

}
