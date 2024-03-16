package basiccode;

public class binarayToDecimal {

	public static int convertBinarayToDecimal(long num)
	{
		int decimal=0,i=0;
		long rem=0;
		while(num!=0)
		{
			rem=num%10;
			num/=10;
			decimal+=rem*Math.pow(2, i);
			i++;
		}
		return decimal;
			
	}
	public static void main(String[] args) {
		long num=100110;
		int decimal=convertBinarayToDecimal(num);
		System.out.println(decimal);
	}

}
