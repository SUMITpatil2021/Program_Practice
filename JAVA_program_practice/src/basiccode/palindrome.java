package basiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {
	
	public static boolean isPalindrome(String str)
	{
		boolean flag=false;
		String newstr="";
		for(int i=str.length()-1;i<0;i--)
		{
			char ch=str.charAt(i);
			newstr=newstr+ch;
		}

		if(str.equals(newstr))
			flag=true;
		else	
			flag=false;
		
		return flag;
	}
	public static void main(String []args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String str=br.readLine();
			boolean palindrome=isPalindrome(str);
			if(palindrome)
				System.out.println(str+" is Palindrome ");
			else
				System.out.println(str+" is not palindrome");
		}
		catch(IOException e)
		{
			// e.printStackTrace();
			System.out.println("error occured while giving string as input ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
