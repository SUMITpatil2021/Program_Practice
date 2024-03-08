// rplace vowels with capital
package strings;

import java.util.Scanner;

public class ReplaceVowelCap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	String res=process(str);
    	System.out.println(res);
	}

	public static String process(String str) {
	StringBuilder res=new StringBuilder();
	int i=0;
while(i<str.length())
	{
		if(isVowel(str.charAt(i))&&isVowel(str.charAt(i+1)))
		{
			char ch=(char)((int)str.charAt(i)-32);
      res.append(ch);
      i+=2;
		}
		else
			
		{
			res.append(str.charAt(i));
			i++;
			
		}
	}
	return res.toString();
	}
	
	public static boolean isVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return true;
		return false;
	}
	

}
