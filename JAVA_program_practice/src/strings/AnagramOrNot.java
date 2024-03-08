package strings;

import java.util.*;
import java.lang.*;

public class AnagramOrNot {

	public static boolean isAnagram(String s1,String s2)
	{
		String str1=s1.replaceAll("\\s", "");
		String str2=s2.replaceAll("\\s", "");
		
		if(str1.length()!=str2.length())
			return false;
		else
		{
			char c1[]=str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
		}
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean anagram=isAnagram(s1,s2);
		if(anagram)
		System.out.println("Strings are Anagrams");
		else
			System.out.println("Strings are not  Anagrams");
		
	}
}
