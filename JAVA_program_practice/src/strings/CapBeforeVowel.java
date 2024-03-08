package strings;

import java.util.Scanner;

public class CapBeforeVowel {

	public static boolean isVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return true;
		else
			return false;
	}
	public static String  process(String str)
	{
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<str.length())
		{
			if(isVowel(str.charAt(i)))
			{
				char ch=(char)((int)str.charAt(i)-32);
				sb.append(ch);
				i++;
			}
			else
			{
				sb.append(str.charAt(i));
				i++;
			}
			
			
		}
		return sb.toString();
	}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//    	String str=sc.nextLine();
    	String res=process("sumit");
    	System.out.println(res);
	}

}
