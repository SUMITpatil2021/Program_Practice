package strings;
import java.util.*;
import java.lang.*;
import java.io.*;


public class ReverseString {

	//using StringBuilder
//	public static StringBuilder revrseString(String str)
//	{
//		StringBuilder sb=new StringBuilder(str);
//		return 	sb.reverse();
//	}
	
	// using iterative method 
	private static String revrseString(String str) {
		
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=str.charAt(i);
		}
		return s;
	}
	
	public static  void main(String []args)
	{
		BufferedReader br =new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String ");
		try
		{
			String str=br.readLine();
			System.out.println(str);
			String rev=revrseString(str);
			System.out.println("-------------------------");
			System.out.println(rev);
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		} 
		
	}

	
}
